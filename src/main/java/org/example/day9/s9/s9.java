package org.example.day9.s9;

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는
// 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.
public class s9 {
    public static void main(String[] args) {
        자동차 a1 = new 페라리();
        페라리 a2 = (페라리)a1;
        a2.뚜껑이_열리다();

        자동차 b1 = new 페라리();
        자동차 b2 = (자동차)b1;
        ((페라리)b2).뚜껑이_열리다();

        페라리 c1 = new 페라리();
        페라리 c2 = c1;
        c2.뚜껑이_열리다();

        페라리 d1 = new 페라리();
        자동차 d2 = (페라리)d1;
        ((페라리)d2).뚜껑이_열리다();

    }
}

class 자동차 {
    void 달리다() {
    }

    void 서다() {
    }
}

class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {
    }
}