package com.oguzcan.subscriber;

import com.oguzcan.DepartmentCode;
import com.oguzcan.EmergencyCode;

public class SubscriberFactory {

    public Subscriber getSubscriber(EmergencyCode emergencyCode) {
        DepartmentCode departmentCode = emergencyCode.getDepartmentCode();

        if (departmentCode == DepartmentCode.MEDICAL) {
            return new Hospital(emergencyCode);
        } else if(departmentCode == DepartmentCode.FIRE) {
            return new FireDepartment(emergencyCode);
        } else if(departmentCode == DepartmentCode.POLICE) {
            return new Police(emergencyCode);
        }
        return null;
    }
}
