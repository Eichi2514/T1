package org.example.SN.day13.s5;

import java.util.ArrayList;
import java.util.List;

public class s5 {
    public static void main(String[] args) {
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<Integer>();

        //filter
        for (int n : arr) if (n % 2 == 0) resultAl.add(n);

        //map
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        System.out.println(resultAl);
    }
}
