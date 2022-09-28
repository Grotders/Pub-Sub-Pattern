package com.oguzcan.subscriber;

import com.oguzcan.EmergencyCode;

public class Police extends Subscriber{

    public Police(EmergencyCode emergencyCode) {
        super(emergencyCode);
    }

    public void work() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("[%s:%s]\t", currentTask, currentTask.getDescription()))
                .append("Polis ekipleri yola çıktı.");
        System.out.println(sb);
    }

}
