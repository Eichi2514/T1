package org.example.SN;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {4, 2, 6, 1, 7, 6};

        System.out.println(Solution.solution("1"));
    }
}
class Solution {
    public static String solution(String code) {
        String answer = "";
        int mod = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mod == 0) {
                if (code.charAt(i) == '1') {
                    mod = 1;
                } else if (i % 2 == 0) answer += code.charAt(i);
            } else if (mod == 1) {
                if (code.charAt(i) == '1') {
                    mod = 0;
                } else if (i % 2 != 0) answer += code.charAt(i);
            }
        }
        if (answer.equals("")) return "EMPTY";
        return answer;
    }
}
