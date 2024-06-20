package org.example.PM.p369;

public class p369 {
}

class Car {
    String name;
    int number;

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Car() {
        this("이름없음", 0);
    }

    public Car(String name) {
        this(name, 0);
    }
}