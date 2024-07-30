package org.example.SN;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {293, 1000, 395, 678, 94};
        int[] ss = {94, 777, 104, 1000, 1, 12};

        System.out.println(Solution.solution("banana"));
    }
}

class Solution {
    public static String[] solution(String my_string) {
        String[] answer2 = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            String tmp = "";
            for (int j = 0; j <= i; j++) {
                tmp += my_string.charAt(my_string.length()-j-1);
            }
            answer2[i] = tmp;
        }
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < answer2.length; i++) {
            answer[i] = "";
            for (int j = 0; j < answer2[i].length(); j++) {
                answer[i] += answer2[i].charAt(answer2[i].length()-j-1);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}