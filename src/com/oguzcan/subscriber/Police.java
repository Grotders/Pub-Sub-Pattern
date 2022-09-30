package com.oguzcan.subscriber;

import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;

public class Police extends Subscriber{

    public Police() {
        super(DepartmentCode.POLICE);
    }

    @Override
    public void work() {
        if (!notifications.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Notification notification = notifications.remove();
            sb.append(notification).append(": Polis kuvvetleri harekete geçti -> ").append(notification.getLocation());
            System.out.println(sb);
        } else {
            System.out.println("[Polis]:\tHerhangi bir ihbar bulunmamaktadır.");
        }
    }
}
