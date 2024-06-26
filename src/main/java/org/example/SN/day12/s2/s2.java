package org.example.SN.day12.s2;

import java.util.HashMap;
import java.util.Map;

public class s2 {
    // 문제 : 아래가 실행되도록 해주세요.
    // 조건 : 배열을 사용할 수 없습니다.
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
//    사람[] 사람들 = new 사람[5]; ***** 배열방식 *****
//    List<사람> 사람들 = new ArrayList<>(); ***** ArrayList방식 *****
    Map<Integer,사람> 사람들 = new HashMap<>(); // ***** HashMap방식 *****

    int 마지막_사람의_번호 = 0;

    void add사람(String 이름, int 나이) {
        int 번호 = 마지막_사람의_번호 + 1;
        사람 a사람 = new 사람();
        a사람.번호 = 번호;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

//        사람들[번호-1] = a사람; ***** 배열방식 *****
//        사람들.add(a사람); ***** ArrayList방식 *****
        사람들.put(번호,a사람); // ***** HashMap방식 *****

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
        마지막_사람의_번호++;
    }

    사람 get사람(int 번호) {
//        return 사람들[번호-1]; ***** 배열방식 *****
//        return 사람들.get(번호-1); ***** ArrayList방식 *****
        return 사람들.get(번호); // ***** HashMap방식 *****
    }
}

class 사람 {
    int 번호;
    String 이름;
    int 나이;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.번호, this.이름, this.나이);
    }
}