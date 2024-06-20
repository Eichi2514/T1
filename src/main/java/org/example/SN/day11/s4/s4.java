package org.example.SN.day11.s4;

public class s4 {
    public static void main(String[] args) {
        // 문자열 생성 : StringBuilder
        StringBuilder 변수 = new StringBuilder("ABC");
        // ABC

        // 문자열 추가 : append
        System.out.println(변수.append("DEF"));
        // ABC+DEF = ABC+DEF
        System.out.println(변수.append("G"));
        // ABCDEF+G = ABCDEFG

        // 문자열 삽입 : insert
        System.out.println(변수.insert(2, "H"));
        // 2번방 뒤에 H를 추가한다 = AB+H+CDEFG = ABHCDEFG

        // 문자열 치환, 문자열 교체 : replace
        System.out.println(변수.replace(3, 6, "IJ"));
        // 3번방부터 6번방 까지 들어있는 값을 IJ로 치환 = ABH(CDE를 IJ로 치환)FG = ABHIJFG

        // 인덱싱, 문자열 자르기 : substring 매개변수가 하나일때
        System.out.println(변수.substring(5));
        // 5번방앞을 자른다 *변수안의 값은 변하지 않는다 = (ABHIJ)FG = FG

        // 인덱싱, 문자열 자르기 : substring 매개변수가 두개일때
        System.out.println(변수.substring(3, 7));
        // 3번방 안에 값부터 7번방앞을 제외하고 자른다 *변수안의 값은 변하지 않는다 =
        // (ABH)IJFG() = IJFG

        // 문자 삭제 : deleteCharAt
        System.out.println(변수.deleteCharAt(3));
        // 3번방의 값을 삭제한다 = ABH(I)JFG = ABHJFG

        // 문자열 삭제 : 변수.delete(방번호, 변수.length())
        System.out.println(변수.delete(3, 변수.length()));
        // 3번방 안에 값부터 뒤의 값을 전부 삭제한다 = ABH(JFG) = ABH

        // 문자열 변환 : toString
        System.out.println(변수.toString());
        // 문자열을 스트링 타입으로 변환한다 = ABH

        // 문자열 뒤집기 : reverse
        System.out.println(변수.reverse());
        // 문자열의 순서를 뒤집는다 = HBA

        // 문자 대체, 문자 교체, 문자 치환 : 변수.setCharAt
        변수.setCharAt(1, 'K');
        System.out.println(변수);
        // 1번방의 값을 K로 바꾼다 = H(B를 K로 대체)A = HKA

        // 문자열 길이 조정 : 변수.setLength
        변수.setLength(2);
        System.out.println(변수);
        // 2번방뒤를 자른다 *변수안의 값은 변하지 않는다 = HK(A) = HK
    }
}
