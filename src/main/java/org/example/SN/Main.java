package org.example.SN;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(6));
    }
}
class Solution {
    public static int solution(int n) {
        int answer = 0;
        int max = n*6;

        for (int i = 1; i <= n && i <= 6; i++) {
            if (n % i == 0 && 6 % i == 0) {

                answer = max / i / 6;
            }
        }

        return answer;
    }
}