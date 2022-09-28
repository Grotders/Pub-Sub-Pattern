package com.oguzcan.eventChannel;

import com.oguzcan.Emergency;
import com.oguzcan.subscriber.Subscriber;

import java.util.HashSet;

public class EmergencyService implements EventChannel{

    private HashSet<Subscriber> subscribers = new HashSet<>();

    // Singleton
    private static EmergencyService emergencyService = null;
    private final Database database = new Database();
    private EmergencyService() {
    }
    public static EmergencyService getInstance() {
        if (emergencyService == null) {
            emergencyService = new EmergencyService();
        }
        return emergencyService;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber() {
        subscribers = new HashSet<>();
    }

    @Override
    public void notifyEvent(Emergency emergency) {
        removeSubscriber();
        System.out.println(emergency);


        for (var code : emergency.getEmergencyCodes()) {
            database.getSubscriber(code);
        }
        subscribers.forEach(Subscriber::work);
    }
}
