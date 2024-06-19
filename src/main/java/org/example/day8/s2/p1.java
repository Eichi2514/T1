package org.example.day8.s2;

class p1 {
    public static void main(String[] args){
        계산기1.더한결과를_화면에_출력(10,20);
        계산기1.더한결과를_화면에_출력(50,20);
        계산기1.뺀결과를_화면에_출력(50,20);
        계산기1.뺀결과를_화면에_출력(5,2);
        계산기1.곱한결과를_화면에_출력(5,2);
    }
}
class 계산기1 {
    public static void 더한결과를_화면에_출력(int i, int j){
        System.out.println(i+j);
    }
    public static void 뺀결과를_화면에_출력(int i, int j){
        System.out.println(i-j);
    }
    public static void 곱한결과를_화면에_출력(int i, int j){
        System.out.println(i*j);
    }
}
