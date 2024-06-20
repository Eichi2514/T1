package org.example.SN.day9.s6;

public class s6 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언이", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립이", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String a;
    String b;

    void 공격(String 이름, String 무기) {
        System.out.println(이름 + "(가) " + 무기 + "(으)로 공격합니다.");
        this.a = 이름;
        this.b = 무기;
    }

    void 재공격() {
        System.out.println(this.a + "(가) " + this.b + "(으)로 공격합니다.");
    }
}


