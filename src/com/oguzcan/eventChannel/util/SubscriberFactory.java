package com.oguzcan.eventChannel.util;

import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.subscriber.FireDepartment;
import com.oguzcan.subscriber.Hospital;
import com.oguzcan.subscriber.Police;
import com.oguzcan.subscriber.Subscriber;

public class SubscriberFactory {

    public Subscriber getSubscriber(DepartmentCode departmentCode) {

        if (departmentCode == DepartmentCode.MEDICAL) {
            return new Hospital();
        } else if(departmentCode == DepartmentCode.FIRE) {
            return new FireDepartment();
        } else if(departmentCode == DepartmentCode.POLICE) {
            return new Police();
        }
        return null;
    }
}
