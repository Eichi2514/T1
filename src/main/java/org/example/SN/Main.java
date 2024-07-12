package org.example.SN;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[6];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
//        a[5] = 6;
//        a[6] = 7;
//        a[7] = 8;
//        a[8] = 9;
//        a[9] = 10;
//        String b = "left";
        System.out.println(Solution.solution(3628800));

    }
}

class Solution {
    public static int solution(int n) {
        int answer = 1;
        int pt = 1;
        for (int i = 1; i <= 10; i++) {
            pt *= i;
            if (pt <= n) answer = i;

        }
        return answer;
    }
}