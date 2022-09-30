package com.oguzcan.message;

import com.oguzcan.message.enums.DepartmentCode;
import com.oguzcan.message.enums.EmergencyCode;

public class Notification {

    private String location;
    EmergencyCode emergencyCode;

    public Notification(Builder builder) {
        this.location = builder.location;
        this.emergencyCode = builder.emergencyCode;
    }

    public static class Builder {
        private String location;
        private EmergencyCode emergencyCode;

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setEmergencyCode(EmergencyCode emergencyCode) {
            this.emergencyCode = emergencyCode;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }

    public DepartmentCode getDepartmentCode() {
        return emergencyCode.getDepartmentCode();
    }

    public String getLocation() {
        return location;
    }

    public EmergencyCode getEmergencyCode() {
        return emergencyCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(String.format("[%s:%s]", emergencyCode.name(), emergencyCode.getDescription())).toString();
    }
}
