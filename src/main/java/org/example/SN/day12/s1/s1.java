package org.example.SN.day12.s1;

public class s1 {
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
    사람 a사람1;
    사람 a사람2;
    사람 a사람3;
    int number;

    void add사람(String 이름, int 나이) {
        int 번호 = this.number + 1;
        사람 a사람 = new 사람();
        a사람.번호 = this.number + 1;
        a사람.이름 = 이름;
        a사람.나이 = 나이;

        if (번호 == 1) {
            a사람1 = a사람;
        } else if (번호 == 2) {
            a사람2 = a사람;
        } else if (번호 == 3) {
            a사람3 = a사람;
        }

        System.out.println("나이가 " + 나이 + "살인 " + number + "번째 사람(" + 이름 + ")이 추가되었습니다.");
        this.number++;
    }

    사람 get사람(int 번호) {
        if (번호 == 1) {
            return a사람1;
        } else if (번호 == 2) {
            return a사람2;
        } else if (번호 == 3) {
            return a사람3;
        }
        return null;
    }
}

class 사람 {
    int 번호;
    int 나이;
    String 이름;


    void 자기소개() {
        System.out.println("저는 " + 번호 + "번, " + 이름 + ", " + 나이 + "살 입니다.");
    }
}