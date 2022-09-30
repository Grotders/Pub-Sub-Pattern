package com.oguzcan.eventChannel;

import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.message.Emergency;
import com.oguzcan.message.enums.EmergencyCode;
import com.oguzcan.subscriber.Subscriber;

public interface EventChannel {

    void addSubscriber(DepartmentCode departmentCode , Subscriber subscriber);
    void removeSubscriber(DepartmentCode departmentCode ,Subscriber subscriber);

    void addEmergency(Emergency emergency);
    void broadcast();
    void notifySubscriber(Notification notification);
    void commandToWorkForSubscriber();

}
