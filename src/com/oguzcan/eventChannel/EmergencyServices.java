package com.oguzcan.eventChannel;

import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.message.Emergency;
import com.oguzcan.message.enums.EmergencyCode;
import com.oguzcan.eventChannel.util.Database;
import com.oguzcan.message.Notification;
import com.oguzcan.subscriber.Subscriber;

import java.util.*;

public class EmergencyServices implements EventChannel{

    private Map<DepartmentCode, Set<Subscriber>> subscribersDepartmentMap = new HashMap<>();
    private Queue<Emergency> emergenciesQueue = new LinkedList<>();

    // Singleton
    private static EmergencyServices emergencyServices = null;
    private EmergencyServices() {

    }
    public static EmergencyServices getInstance() {
        if (emergencyServices == null) {
            emergencyServices = new EmergencyServices();
            new Database();
        }
        return emergencyServices;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private boolean isDepartmentCodeAvailable(DepartmentCode departmentCode) {
        return subscribersDepartmentMap.containsKey(departmentCode);
    }

    @Override
    public void addSubscriber(DepartmentCode departmentCode ,Subscriber subscriber) {
        Set<Subscriber> subscribers = isDepartmentCodeAvailable(departmentCode) ?
                subscribersDepartmentMap.get(departmentCode) : new HashSet<>();

        subscribers.add(subscriber);
        subscribersDepartmentMap.put(departmentCode, subscribers);
    }

    @Override
    public void removeSubscriber(DepartmentCode departmentCode ,Subscriber subscriber) {
        if (isDepartmentCodeAvailable(departmentCode)) {
            Set<Subscriber> subscribers = subscribersDepartmentMap.get(departmentCode);
            subscribers.remove(subscriber);
            subscribersDepartmentMap.put(departmentCode, subscribers);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void addEmergency(Emergency emergency) {
        emergenciesQueue.add(emergency);
        broadcast();
    }

    @Override
    public void broadcast() {
        while (!emergenciesQueue.isEmpty()) {
            Emergency emergency = emergenciesQueue.remove();
            Set<EmergencyCode> emergencyCodes = emergency.getEmergencyCodes();

            System.out.println(emergency);

            for (EmergencyCode emergencyCode : emergencyCodes) {
                Notification notification = new Notification.Builder()
                        .setLocation(emergency.getLocation())
                        .setEmergencyCode(emergencyCode)
                        .build();

                notifySubscriber(notification);
            }

        }

        commandToWorkForSubscriber();
    }

    public void notifySubscriber(Notification notification) {
        Set<Subscriber> subscribers = subscribersDepartmentMap.get(notification.getDepartmentCode());

        subscribers.forEach(t -> t.addNotification(notification));
    }

    public void commandToWorkForSubscriber() {
        subscribersDepartmentMap.forEach((departmentCode, subscribers) -> {
            subscribers.forEach(t -> t.work());
        });
    }
}
