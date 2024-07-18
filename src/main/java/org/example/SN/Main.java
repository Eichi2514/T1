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
        System.out.println(Solution.solution("3 + 2 + x + 2 + x"));
    }
}

class Solution {
    public static String solution(String polynomial) {
        String answer = "";
        if (polynomial.charAt(0) == 'x') polynomial = polynomial.replaceAll("x ", "1x ");
        polynomial = polynomial.replaceAll(" x", " 1x");
        String[] numbers = polynomial.split(" \\+ ");
        int xIndex = 0;
        int nIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("x")) xIndex++;
            else nIndex++;
        }
        String[] x = new String[xIndex];
        String[] n = new String[nIndex];
        xIndex = 0;
        nIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("x")) {
                x[xIndex] = numbers[i].replace("x","");
                xIndex++;
            } else {
                n[nIndex] = numbers[i];
                nIndex++;
            }
        }
        int xr = 0;
        int nr = 0;
        for (int i = 0; i < xIndex; i++) {
            xr += Integer.parseInt(x[i]);
        }
        for (int i = 0; i < nIndex; i++) {
            nr += Integer.parseInt(n[i]);
        }
        if(numbers[0].contains("x")){
            answer = Integer.toString(xr) + "x + " + Integer.toString(nr);
        }else answer = Integer.toString(nr) + " + " + Integer.toString(xr) + "x";
        answer = answer.replaceAll(" \\+ 0x", "");
        answer = answer.replaceAll(" \\+ 0", "");
        answer = answer.replaceAll("0x \\+ ", "");
        answer = answer.replaceAll("0 \\+ ", "");
        return answer;
    }
}