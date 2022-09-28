package com.oguzcan;

import com.oguzcan.publisher.Person;
import com.oguzcan.publisher.Ship;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        // Create emergency
        Emergency emergency = new Emergency.Builder()
                .setFullName("Oğuzcan")
                .setLocation("Avcılar")
                .addEmergencyCode(EmergencyCode.RED)
                .addEmergencyCode(EmergencyCode.SILVER).build();

        person.addEmergency(emergency);

        System.out.println("\n");

        Ship ship = new Ship();
        Emergency emergency2 = new Emergency.Builder()
                .setFullName("Zeynep")
                .setLocation("Mars")
                .addEmergencyCode(EmergencyCode.BLUE).build();
        ship.addEmergency(emergency2);
    }
}
