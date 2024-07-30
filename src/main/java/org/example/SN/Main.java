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
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
}