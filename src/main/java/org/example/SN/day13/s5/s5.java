package org.example.SN.day13.s5;

import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b == "+");
        System.out.println(c);

        if (b == "+") System.out.println(a + c);
        else if (b == "-") System.out.println(a - c);
        else if (b == "*") System.out.println(a * c);
        else if (b == "/") System.out.println(a / c);

    }
}