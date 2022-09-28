package com.oguzcan.subscriber;

import com.oguzcan.EmergencyCode;
import com.oguzcan.eventChannel.EmergencyService;

public abstract class Subscriber {

    public final EmergencyService emergencyService;
    protected EmergencyCode currentTask;

    public Subscriber(EmergencyCode emergencyCode) {
        emergencyService = EmergencyService.getInstance();
        this.currentTask = emergencyCode;
        subscribe();
    }

    public void subscribe() {
        emergencyService.addSubscriber(this);
    }

    public abstract void work();
}
