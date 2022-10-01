package com.oguzcan.publisher;

import com.oguzcan.eventChannel.EmergencyServices;
import com.oguzcan.message.Emergency;

public interface Publisher {
    EmergencyServices emergencyServices = EmergencyServices.getInstance();

    default void publishEmergency(Emergency emergency) {
        emergencyServices.addEmergency(emergency);
    }
}
