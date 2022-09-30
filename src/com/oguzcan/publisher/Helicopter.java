package com.oguzcan.publisher;

import com.oguzcan.message.Emergency;
import com.oguzcan.eventChannel.EmergencyServices;

public class Helicopter implements Publisher{
    private EmergencyServices emergencyServices;

    public Helicopter() {
        this.emergencyServices = EmergencyServices.getInstance();
    }

    @Override
    public void publishEmergency(Emergency emergency) {
        emergencyServices.addEmergency(emergency);
    }
}
