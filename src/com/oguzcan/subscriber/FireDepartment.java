package com.oguzcan.subscriber;

import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;

public class FireDepartment extends Subscriber{

    public FireDepartment() {
        super(DepartmentCode.FIRE);
    }

    @Override
    public void work() {
        if (!notifications.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Notification notification = notifications.remove();
            sb.append(notification).append(": İtfaiye ekipleri harekete geçti -> ").append(notification.getLocation());
            System.out.println(sb);
        } else {
            System.out.println("[İtfaiye]:\tHerhangi bir ihbar bulunmamaktadır.");
        }
    }
}
