package org.example.SN;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
//        a[6] = 7;
//        a[7] = 8;
//        a[8] = 9;
//        a[9] = 10;
        String b = "left";
        System.out.println(Solution.solution(a, 5));
    }
}

class Solution {
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        if (k == 1) return numbers[index];

        for (int i = 1; i < k; i++) {
            index += 2;
            if (index >= numbers.length) index -= numbers.length;
        }
        answer = numbers[index];

        return answer;
    }
}