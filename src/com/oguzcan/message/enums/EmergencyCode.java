package com.oguzcan.message.enums;

import static com.oguzcan.message.enums.DepartmentCode.*;

public enum EmergencyCode {

    RED("Fire", FIRE), BLUE("Medical",MEDICAL), YELLOW("Bomb", POLICE),
    GRAY("Combative", POLICE), SILVER("Hostage/Shooter", POLICE), ORANGE("Hazard", MEDICAL);

    String description;
    DepartmentCode departmentCode;

    EmergencyCode(String description, DepartmentCode departmentCode) {
        this.description = description;
        this.departmentCode = departmentCode;
    }

    public DepartmentCode getDepartmentCode() {
        return departmentCode;
    }

    public String getDescription() {
        return description;
    }
}

