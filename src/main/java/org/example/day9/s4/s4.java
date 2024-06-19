package org.example.day9.s4;

public class s4 {
    public static void main(String[] args) {
        칼 a칼 = new 칼();
        a칼 = new 활();
        a칼.공격();
    }
}
class 칼{
    void 공격(){}
}
class 활 extends 칼{
    void 공격(){System.out.println("공격");}
}
