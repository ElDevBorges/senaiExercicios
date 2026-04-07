package controller;

import java.util.Scanner;

public class ExemploTypeCast {
    public static void main(String[] args) {
        int c, n1, n2;

        Scanner sc = new Scanner(System.in);




        System.out.print("digite um numero: ");
        n1 = sc.nextInt();

        System.out.print("digite outro numero: ");
        n2 = sc.nextInt();

        c = n1 / n2;

        System.out.println("valor de c: " + c);

        double d;
        d = (double) n1 / n2;
        System.out.println("valor de D: " + d);

    }
}
