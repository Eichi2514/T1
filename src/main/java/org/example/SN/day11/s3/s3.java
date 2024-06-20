package org.example.SN.day11.s3;


public class s3 {
    public static void main(String[] args) {
        try {
            int rs = 계산기.나누다(15,0);
            System.out.println(rs);
        }catch (ArithmeticException e){
            System.out.println("0으로 못나눠");
        }catch (Exception e) {
            System.out.println("알 수 없는 예외 상황 발생");
        }
        System.out.println(123);
    }
}

class 계산기{
    static int 나누다(int a,int b){
        int rs = 0;
        rs = a/b;
        return rs;
    }
}