package org.example.SN.day13.s4;

import java.util.Arrays;

public class s4 {
    public static void main(String[] args) {
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        int rsArrLen = 0;

        for (int n : arr) {
            if (n % 2 == 0) {
                rsArrLen++;
            }
        }

        int[] rsArr = new int[rsArrLen];
        int rsArrLastIndex = -1;

        for (int n : arr) {
            if (n % 2 != 0) {
                continue;
            }
            rsArr[++rsArrLastIndex] = n;
        }
        System.out.println(Arrays.toString(rsArr));

        int[] rsArray = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(rsArray));

    }
}
