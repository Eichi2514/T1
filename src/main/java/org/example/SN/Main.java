package org.example.SN;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    }
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a + "" + b;
        if (Integer.parseInt(ab) >= (2 * a * b)) answer = Integer.parseInt(ab);
        else answer = 2 * a * b;
        return answer;
    }
}