package com.oguzcan.publisher;

import com.oguzcan.Emergency;
import com.oguzcan.eventChannel.EmergencyService;


public class Ship implements Publisher{
    private Emergency emergency;
    private EmergencyService emergencyService;

    public Ship() {
        this.emergencyService = EmergencyService.getInstance();
    }

    @Override
    public void addEmergency(Emergency emergency) {
        this.emergency = emergency;
        publishEvent();
    }

    @Override
    public void publishEvent() {
        emergencyService.notifyEvent(emergency);
    }
}
