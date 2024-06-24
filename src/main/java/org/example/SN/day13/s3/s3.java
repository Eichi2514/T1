package org.example.SN.day13.s3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class s3 {
    public static void main(String[] args) {
        //일반
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.println(Arrays.toString(arr));


        //내가 푼 스트림
        IntStream.range(1, 11)
                .map(e -> e * 2)
                .forEach(e -> System.out.printf("%d, ", e));

        //강사님이 푼 스트림
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rsArray = Arrays.stream(arr)
                .map(e -> e * 2).toArray();

        System.out.println(Arrays.toString(rsArray));
    }
}
