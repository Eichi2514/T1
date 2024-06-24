package org.example.SN.day13.s4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
////////////////////////////////////////////////////////////////////////
        arr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0) // 걸러내기
                .map(e -> e * 2) // 연산 부여
                .toArray(); // Array형으로 저장

        System.out.println(Arrays.toString(arr));
////////////////////////////////////////////////////////////////////////
        List<Integer> resultAl = new ArrayList<Integer>();

        //filter
        for (int n : arr) if (n % 2 == 0) resultAl.add(n);

        //map
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        System.out.println(resultAl);
////////////////////////////////////////////////////////////////////////
        resultAl = Arrays.stream(arr)
                .filter(e -> e%2 == 0)
                .map(e->e*2)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(resultAl);

    }
}
