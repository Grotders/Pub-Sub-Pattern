package com.oguzcan;

import java.util.HashSet;

public class Emergency {

    private static int NEXT_EMERGENCY_ID = 1;

    private int emergencyId;
    private HashSet<EmergencyCode> emergencyCodes = new HashSet<>();

    private String fullName;
    private String location;

    public Emergency(Builder builder) {
        this.emergencyId = NEXT_EMERGENCY_ID++;
        this.fullName = builder.fullName;
        this.location = builder.location;
        this.emergencyCodes = builder.emergencyCodes;
    }

    // Builder
    public static class Builder {
        private String fullName;
        private String location;
        private HashSet<EmergencyCode> emergencyCodes = new HashSet<>();

        public Builder() {}

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder addEmergencyCode(EmergencyCode emergencyCode) {
            this.emergencyCodes.add(emergencyCode);
            return this;
        }

        public Emergency build() {
            return new Emergency(this);
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public HashSet<EmergencyCode> getEmergencyCodes() {
        return emergencyCodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(emergencyId).append(": ")
                .append(fullName)
                .append(" -> ")
                .append(location);

        return sb.toString();
    }
}
