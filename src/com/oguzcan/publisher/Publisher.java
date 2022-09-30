package com.oguzcan.publisher;

import com.oguzcan.message.Emergency;

public interface Publisher {

    void publishEmergency(Emergency emergency);
}
