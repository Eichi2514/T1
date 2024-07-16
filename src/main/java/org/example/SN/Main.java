package org.example.SN;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
//        a[3] = 4;
//        a[4] = 5;
//        a[5] = 6;
//        a[6] = 7;
//        a[7] = 8;
//        a[8] = 9;
//        a[9] = 10;
//        String b = "left";
//        System.out.println(Solution.solution(a,13));

    }
}
class Solution {
    public String solution(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            int count = -1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }if (count == 0) tmp += s.charAt(i);
        }
        char[] chars = tmp.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }
        return answer;
    }
}
