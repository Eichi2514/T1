package org.example.SN;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a1 = new String[4];
        String[] a2 = new String[3];
        a1[0] = "def";
        a1[1] = "dww";
        a1[2] = "dzx";
        a1[3] = "loveaw";
        a2[0] = "z";
        a2[1] = "d";
        a2[2] = "x";
//        a[7] = 8;
//        a[8] = 9;
//        a[9] = 10;
//        String b = "left";
        System.out.println(Solution.solution(a2, a1));
    }
}
class Solution {
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        String tmp = "";
        Arrays.sort(spell);
        for (int i = 0; i < spell.length; i++) {
            tmp += spell[i];
        }
        for (int i = 0; i < dic.length; i++) {
            String[] tmps = dic[i].split("");
            Arrays.sort(tmps);
            dic[i] = "";
            for (int j = 0; j < tmps.length; j++) {
                dic[i] += tmps[j];
            }
            if (tmp.equals(dic[i])) {
                answer = 1;
            }
        }
        return answer;
    }
}