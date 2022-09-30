package com.oguzcan.subscriber;

import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;

public class Hospital extends Subscriber{

    public Hospital() {
        super(DepartmentCode.MEDICAL);
    }

    @Override
    public void work() {
        if (!notifications.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Notification notification = notifications.remove();
            sb.append(notification).append(": Ambulans ekipleri harekete geçti -> ").append(notification.getLocation());
            System.out.println(sb);
        } else {
            System.out.println("[Ambulans]:\tHerhangi bir ihbar bulunmamaktadır.");
        }
    }
}
