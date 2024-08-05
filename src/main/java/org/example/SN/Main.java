package org.example.SN;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {2, 1, 2};
        System.out.println(Solution.solution(arr, query));
    }
}

class Solution {
    public static ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            int n = answer.size();
            if (i % 2 == 0) {
                for (int j = query[i] + 1; j < n; j++) {
                    answer.remove(answer.size() - 1);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    answer.remove(0);
                }
            }
        }
        return answer;
    }
}