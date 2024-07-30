package org.example.SN;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {4, 2, 6, 1, 7, 6};
//        int[] ss = {94, 777, 104, 1000, 1, 12};
//        System.out.println(Solution.solution(s));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length-5];
        Arrays.sort(num_list);
        for (int i = 4; i < num_list.length; i++) {
            answer[i-4] = num_list[i];
        }
        return answer;
    }
}