package org.example.SN;


public class Main {
    public static void main(String[] args) {
        String[] a = new String[10];
        a[0] = "3 + 3 = 6";
        a[1] = "3 - 3 = 0";
        a[2] = "3 - -3 = 0";
        a[3] = "3 + 9 = 12";
        a[4] = "3 + 12 = 15";
        a[5] = "3 + 15 = 18";
        a[6] = "3 + 18 = 21";
        a[7] = "3 + 21 = 24";
        a[8] = "3 + 24 = 27";
        a[9] = "3 + 27 = 30";
        System.out.println(Solution.solution(a));
    }
}

class Solution {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] answer2 = new String[5];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = quiz[i].replaceAll(" - ", " + -");
            quiz[i] = quiz[i].replaceAll("--", "");
            answer2 = quiz[i].split(" ");
            long X = Integer.parseInt(answer2[0]);
            long Y = Integer.parseInt(answer2[2]);
            long Z = Integer.parseInt(answer2[4]);
            if (Z == X + Y) {
                answer[i] = "O";
            } else answer[i] = "X";
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}