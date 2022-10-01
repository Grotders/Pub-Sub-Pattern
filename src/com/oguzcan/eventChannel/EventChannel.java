package com.oguzcan.eventChannel;

import com.oguzcan.message.Notification;
import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.message.Emergency;
import com.oguzcan.message.enums.EmergencyCode;
import com.oguzcan.subscriber.Subscriber;

public interface EventChannel {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);

    void addEmergency(Emergency emergency);
    void broadcast();
    void notifySubscribers(Notification notification);
    void commandToWorkForSubscribers();

}
