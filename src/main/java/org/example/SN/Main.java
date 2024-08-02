package org.example.SN;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {1, 4, 2, 5, 3};
        System.out.println(Solution.solution("78720646226947352489"));
    }
}

class Solution {
    public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i)-48;
        }
        answer = answer % 9;
        return answer;
    }
}