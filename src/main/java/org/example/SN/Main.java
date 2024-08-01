package org.example.SN;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] s = {1, 4, 2, 5, 3};
        System.out.println(Solution.solution(s));
    }
}

class Solution {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0) stk.add(arr[i]);
            else if (stk.get(stk.size() - 1) < arr[i]) stk.add(arr[i]);
            else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
                i--;
            }
        }
        return stk;
    }
}