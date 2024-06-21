package org.example.SN.day12.s4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (true) {
            System.out.printf("숫자 : ");
            try {
                a = sc.nextInt();
                sc.nextLine();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자 똑바로 입력해");
                System.out.println(" ");
                break;
            }
        }
        System.out.printf("입력된 숫자 : %d\n", a);
        System.out.printf("\n");

        sc.close();
    }
}
