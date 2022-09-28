package com.oguzcan.subscriber;

import com.oguzcan.EmergencyCode;

public class Hospital extends Subscriber{

    public Hospital(EmergencyCode emergencyCode) {
        super(emergencyCode);
    }

    public void work() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("[%s:%s]\t",currentTask, currentTask.getDescription()))
                .append("Ambulans ekipleri yola çıktı");
        System.out.println(sb);
    }
}
