package org.example.day8.s1;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin");
        System.out.println(msg);
        // String 타입만 넣을수 있는 msg 안에 greet 넣고 greet 안에 msg를 넣고 msg의 안의 name의 값은 Jin이다
        /// 문자열만 담을 수 있는 변수 msg에 greet 함수 실행 결과를 넣는다
        // 변수 msg를 출력 후 줄바꿈 한다

        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");
        // Point 타입만 넣을수 있는 point 안에 createPoint를 넣고 createPoint 안의 x와 y의 값은 5와 10이다
        ///
        // 문자 "Point create at ("와 변수 point.x와 문자 ","와 변수 point.y와 문자 ")"를 출력 후 줄바꿈 한다

        int[] evens = firstNEvenNumbers(5);
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
        // int 타입만 넣을수 있는 배열 evens 안에 firstNEvenNumbers을 넣고 firstNEvenNumbers 안의 n의 값은 5이다
        ///
        // 문자 "first 5 even numbers :"와 변수 Arrays.toString(evens)를 출력 후 줄바꿈 한다
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
        // String 타입만 넣을수 있는 greet 안에 String 타입만 넣을수 있는 name을 넣는다
        /// 문자열 매개변수 1개를 받는 greet 메서드. static == 인스턴화 없이 실행한다
        // 문자 "Hello,"와 변수 name과 문자"!"를 return한다
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y);
        // Point타입만 넣을수 있는 createPoint 안에 int 타입만 넣을수 있는 x와 y를 넣는다
        // New타입 Point안에 x와 y가 들어간 값을 리턴한다
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];
        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num;
        // int타입만 넣을수 있는 i의 초기값은 0이고 변수 num의 초기값은 2일때
        // i가 n보다 작으면 i는 값이 증가하고 n에 2를 더한후 반복한다
        // 배열 evenNumbers의 i번째에 num을 넣는다
        }
        return evenNumbers;
        // evenNumbers을 리턴한다
    }
}
