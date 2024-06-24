package org.example.SN.day13.s1;

import java.util.Arrays;
import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        long sum = Arrays.stream(inputs)
                .mapToLong(e -> Long.parseLong(e))
                .sum();

//        long sum = 0L;
//        for (String inputsData : inputs) {
//            sum += Long.parseLong(inputData);
//        }

        System.out.println(sum);

    }
}
