package org.example.day10.s6;

public class s6 {
    public static void main(String[] args) {
        사람 사람1 = new 김철수();
        System.out.println("==사람1 정보==");
        System.out.printf("나이 : %d\n", 사람1.나이);
        System.out.printf("\n");

        사람 사람2 = new 김철수("김철수");
        System.out.println("==사람1 정보==");
        System.out.printf("나이 : %d\n", 사람2.나이);
        System.out.printf("\n");

        사람 사람3 = new 사람();
        System.out.println("==사람2 정보==");
        System.out.printf("나이 : %d\n", 사람3.나이);
        System.out.printf("\n");

        사람 사람4 = new 사람("김영희");
        System.out.println("==사람2 정보==");
        System.out.printf("나이 : %d\n", 사람4.나이);
        System.out.printf("\n");
    }
}

class 사람 {
    String 이름;
    int 나이;

    사람(String 이름) {
        System.out.println("생성자 호출2");
        this.나이 = 22;
    }

    사람() {
        System.out.println("생성자 호출1");
        this.나이 = 21;
    }

}

class 김철수 extends 사람 {
    김철수() {
        System.out.println("생성자 호출3");
        this.나이 = 23;
    }

    김철수(String 이름) {
        System.out.println("생성자 호출4");
        this.나이 = 24;
    }
}
