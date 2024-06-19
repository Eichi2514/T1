package org.example.day9.s7;

// 상황 : DVD방에 3개의 서로다른 tv가 있다. 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다. 현재 리모콘이 3개나 있는습니다.
// 문제 : 알바를 편하게 하기 위해서 표준Tv 리모콘을 구현해주세요.

class s7 {
    public static void main(String[] args) {
        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        a샤오미Tv.끄기();
        a샤오미Tv.vr켜기();

        a삼성Tv.켜기();
        a삼성Tv.끄기();
        a삼성Tv.ar켜기();

        aLGTv.켜기();
        aLGTv.끄기();
        aLGTv.게임모드전환();

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
        표준Tv a표준Tv;

        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        a표준Tv = aLGTv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}

class 표준Tv {
    void 켜기() { }
    void 끄기() { }
}
class 샤오미Tv extends 표준Tv {
    void 켜기() {System.out.println("샤오미Tv 켜집니다.");}
    void 끄기() {System.out.println("샤오미Tv 꺼집니다.");}
    void vr켜기() {System.out.println("샤오미Tv vr켜기!");}
}
class 삼성Tv extends 표준Tv {
    void 켜기() {System.out.println("삼성Tv 켜집니다.");}
    void 끄기() {System.out.println("삼성Tv 꺼집니다.");}
    void ar켜기() {System.out.println("삼성Tv ar켜기!");}
}
class LGTv extends 표준Tv {
    void 켜기() {System.out.println("LGTv 켜집니다.");}
    void 끄기() {System.out.println("LGTv 꺼집니다.");}
    void 게임모드전환() {System.out.println("LGTv 게임모드전환!");}
}