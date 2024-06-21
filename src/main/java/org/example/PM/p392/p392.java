package org.example.PM.p392;

public class p392 {
}

class Bus extends Car {
    int fee;

     Bus(String name, int number, int fee) {
        super(name, number);

        this.fee = fee;
    }
}
class Car {
    String name;
    int number;
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
