package org.example.SN;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2 == 0) {
            for (int i = 2; i <= n; i+=2) {
                    answer += i*i;
            }
        } else for (int i = 1; i <= n; i+=2) {
            answer += i;
        }
        return answer;
    }
}