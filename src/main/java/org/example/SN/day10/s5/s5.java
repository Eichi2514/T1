package org.example.SN.day10.s5;

public class s5 {
    public static void main(String[] args) {
        new 사람("양진홍",2001);
        사람 사람1 = new 사람("김철수", 2000);
        사람 사람2 = new 사람("양희진", 1999);
        new 사람("유중혁",1998);
    }
}

class 사람 {
    String 이름;
    int 년생;
    int 나이;

    사람(String name, int year) {
        this.이름 = name;
        this.년생 = year;
        this.나이 = 2024 - year + 1;

        System.out.println("===== 자기소개 =====");
        System.out.println("이름 : " + this.이름);
        System.out.println(this.년생 + "년생");
        System.out.println("나이 : " + this.나이);
        System.out.println("");
    }
}