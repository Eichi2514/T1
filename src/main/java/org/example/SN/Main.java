package org.example.SN;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {4, 2, 6, 1, 7, 6};
//        int[] ss = {94, 777, 104, 1000, 1, 12};
//        System.out.println(Solution.solution(s));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j < queries[i][1]; j++) {
                if (j%queries[i][2] == 0) arr[j]++;
            }
        }
        return arr;
    }
}