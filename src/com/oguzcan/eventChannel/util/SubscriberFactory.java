package com.oguzcan.eventChannel.util;

import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.subscriber.FireDepartment;
import com.oguzcan.subscriber.Hospital;
import com.oguzcan.subscriber.Police;
import com.oguzcan.subscriber.Subscriber;

public class SubscriberFactory {

    // Factory Pattern
    public Subscriber getSubscriber(DepartmentCode departmentCode) {
        switch (departmentCode) {
            case MEDICAL -> new Hospital();
            case POLICE -> new Police();
            case FIRE -> new FireDepartment();
        }
        return null;
    }
}
