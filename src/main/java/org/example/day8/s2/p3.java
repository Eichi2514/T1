package org.example.day8.s2;

class p3 {
    public static void main(String[] args) {
        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2= Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
    static int oneToSum(int n) {
        int d=0;
        for (int i = 1; i <= n; i++) {
            d = d+i;
        }
        return d;
    }
}