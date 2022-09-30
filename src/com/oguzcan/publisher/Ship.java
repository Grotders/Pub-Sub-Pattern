package com.oguzcan.publisher;

import com.oguzcan.message.Emergency;
import com.oguzcan.eventChannel.EmergencyServices;


public class Ship implements Publisher{
    private EmergencyServices emergencyServices;

    public Ship() {
        this.emergencyServices = EmergencyServices.getInstance();
    }

    @Override
    public void publishEmergency(Emergency emergency) {
        emergencyServices.addEmergency(emergency);
    }
}
