package org.example.day9.s10;

public class s10 {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123, false);
        로봇.get사람6(123, false);

    }
}

class 로봇 {
    static int get정수() {
        System.out.println("정수");
        return 0;
    }

    static boolean get논리() {
        System.out.println("논리");
        return false;
    }

    static 사람 get사람() {
        System.out.println("1");
        return null;
    }

    static 사람 get사람2() {
        System.out.println("2");
        return new 사람();
    }

    static 사람 get사람3() {
        System.out.println("3");
        사람 a사람 = new 사람();
        return new 사람();
    }

    static 사람 get사람4() {
        System.out.println("4");
        return null;
    }

    static 사람 get사람5(int x, boolean y) {
        System.out.println(x + ", " + y);
        return null;
    }

    static void get사람6(int x, boolean y) {
        System.out.println(x + ", " + y);
    }
}

class 사람 extends 로봇 {
}