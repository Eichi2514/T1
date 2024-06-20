package org.example.SN.day9.s5;

public class s5 {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        무기 b무기 = new 활();
        무기 c무기 = new 총();
        System.out.printf("칼 : ");
                a무기.공격();
        a무기.방어();
        b무기.공격();
        b무기.방어();
        c무기.공격();
        c무기.방어();
    }
}

class 무기 {
    void 공격() {
        System.out.println("쏘다.");
    }
    void 방어() {
        System.out.println("막다.");
        System.out.println();
    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("베다.");
    }
}

class 활 extends 무기 {
}

class 총 extends 무기 {
    void 방어() {
        System.out.println("불가.");
        System.out.println();
    }
}