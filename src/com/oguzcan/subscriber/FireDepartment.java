package com.oguzcan.subscriber;

import com.oguzcan.EmergencyCode;

public class FireDepartment extends Subscriber{

    public FireDepartment(EmergencyCode emergencyCode) {
        super(emergencyCode);
    }

    public void work() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("[%s:%s]\t", currentTask, currentTask.getDescription()))
                .append("İtfaiye ekipleri yola çıktı");
        System.out.println(sb);
    }
}
