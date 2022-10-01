package com.oguzcan.subscriber;

import com.oguzcan.eventChannel.EmergencyServices;
import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Subscriber {

    protected final DepartmentCode departmentCode;
    protected Queue<Notification> notifications = new LinkedList<>();

    protected final static EmergencyServices emergencyServices = EmergencyServices.getInstance();

    public Subscriber(DepartmentCode departmentCode) {
        this.departmentCode = departmentCode;
        subscribe();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void subscribe() {
        emergencyServices.addSubscriber(this);
    }

    public DepartmentCode getDepartmentCode() {
        return departmentCode;
    }

    public abstract void work();
}
