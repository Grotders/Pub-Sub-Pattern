package com.oguzcan.eventChannel;

import com.oguzcan.EmergencyCode;
import com.oguzcan.subscriber.SubscriberFactory;

public class Database {
    SubscriberFactory subscriberFactory = new SubscriberFactory();

    public void getSubscriber(EmergencyCode emergencyCode) {
        subscriberFactory.getSubscriber(emergencyCode);
    }
}
