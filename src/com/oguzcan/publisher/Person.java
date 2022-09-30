package com.oguzcan.publisher;

import com.oguzcan.message.Emergency;
import com.oguzcan.eventChannel.EmergencyServices;


public class Person implements Publisher{

    private EmergencyServices emergencyServices;

    public Person() {
       this.emergencyServices = EmergencyServices.getInstance();
    }


    @Override
    public void publishEmergency(Emergency emergency) {
        emergencyServices.addEmergency(emergency);
    }
}
