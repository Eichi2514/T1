package org.example.PM.p391;

public class p391 {
    public static void main(String[] args) {
    }
}

abstract class Machine {
    public abstract void turnOn();

    public abstract void turnOff();
}

class Car extends Machine {

    public void turnOn() {
        System.out.println(" ");
    }

    public void turnOff() {
        System.out.println(" ");
    }
}

