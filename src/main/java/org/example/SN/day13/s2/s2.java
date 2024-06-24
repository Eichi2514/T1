package org.example.SN.day13.s2;

import java.util.stream.IntStream;

public class s2 {
    public static void main(String[] args) {
        // 일반
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // 스트림
        IntStream.range(1, 11)
                .forEach(e -> System.out.println(e));
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // 스트림
        IntStream.range(1, 11)
                .forEach(System.out::println);
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    }
}