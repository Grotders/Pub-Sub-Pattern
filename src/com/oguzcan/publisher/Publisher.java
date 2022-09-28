package com.oguzcan.publisher;

import com.oguzcan.Emergency;

public interface Publisher {
    void addEmergency(Emergency emergency);
    void publishEvent();
}
