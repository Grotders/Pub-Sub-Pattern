package com.oguzcan.eventChannel.util;

import com.oguzcan.message.enums.DepartmentCode;

public class Database {
    SubscriberFactory subscriberFactory = new SubscriberFactory();

    public Database() {
        getSubscriber(DepartmentCode.MEDICAL);
        getSubscriber(DepartmentCode.POLICE);
        getSubscriber(DepartmentCode.FIRE);
    }


    public void getSubscriber(DepartmentCode departmentCode) {
        subscriberFactory.getSubscriber(departmentCode);
    }
}
