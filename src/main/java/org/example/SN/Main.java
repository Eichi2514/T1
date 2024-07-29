package org.example.SN;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Solution.solution(" "));
    }
}

class Solution {
    public static String[] solution(String my_string) {
        String[] answer2 = my_string.split(" ");
        int index = 0;
        for (int i = 0; i < answer2.length; i++) {
            if (!(answer2[i].equals(""))) index++;
        }
        String[] answer = new String[index];
        index = 0;
        for (int i = 0; i < answer2.length; i++) {
            if (!(answer2[i].equals(""))) {
                answer[index] = answer2[i];
                index++;
            }
        }
        return answer;
    }
}