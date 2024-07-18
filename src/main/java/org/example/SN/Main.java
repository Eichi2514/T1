package org.example.SN;


public class Main {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
//        a[6] = "3 + 18 = 21";
//        a[7] = "3 + 21 = 24";
//        a[8] = "3 + 24 = 27";
//        a[9] = "3 + 27 = 30";
        System.out.println(Solution.solution(a,4));
    }
}

class Solution {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int max = n+1;
        int min = n-1;
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (n == numlist[i]) {
                answer[index] = numlist[i];
                index++;
            }
        }
        while (true) {
            if (max <= 10000) {
                for (int i = 0; i < numlist.length; i++) {
                    if (max == numlist[i]) {
                        answer[index] = numlist[i];
                        index++;
                    }
                }
                max++;
            }
            if (min > 0) {
                for (int i = 0; i < numlist.length; i++) {
                    if (min == numlist[i]) {
                        answer[index] = numlist[i];
                        index++;
                    }
                }
                min--;
            } else if (max == 10001 && min == 0) break;
        }
        return answer;
    }
}