package org.example.SN;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] s = {true, false, false, true, true};

        System.out.println(Solution.solution(3, 4, s));
    }
}

class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] nums = new int[included.length];
        for (int i = a, j = 0; j < included.length; i += d, j++) {
            nums[j] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (included[i]) {
                answer += nums[i];
            }
        }
        return answer;
    }
}