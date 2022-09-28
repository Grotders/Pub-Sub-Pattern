package com.oguzcan.eventChannel;

import com.oguzcan.Emergency;
import com.oguzcan.subscriber.Subscriber;

public interface EventChannel {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber();
    void notifyEvent(Emergency emergency);

}
