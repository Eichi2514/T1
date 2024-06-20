package org.example.SN.day8.s2;

class p4 {
    public static void main(String[] args) {
        int 결과1 = Math2.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math2.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math2 {
    static int nToMSum(int n, int m) {
        int Q = 0;
        for (int q = n; q <= m; q++) {
            Q += q;
        }
        return Q;
    }
}