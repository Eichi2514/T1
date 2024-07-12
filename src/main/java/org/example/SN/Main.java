package org.example.SN;

import java.util.Arrays;

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
        System.out.println(Solution.solution("as3628800"));

    }
}

class Solution {
    public static int[] solution(String my_string) {
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) % 1 == 0 && my_string.charAt(i) < 97) {
                index++;
            }
        }
        int[] answer = new int[index];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) % 1 == 0 && my_string.charAt(i) < 97) {
                answer[index2] = my_string.charAt(i) - 48;
                index2++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}