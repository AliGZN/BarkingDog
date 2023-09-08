package org.example;


public class Main {
    public static void main(String[] args) {
        boolean barking = false;
        int hour = 23;
        boolean shouldWake = BarkingDog.shouldWakeUp(barking, hour);
        System.out.println("Should wake up? " + shouldWake);
    }
}