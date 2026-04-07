package controller;

import java.util.Scanner;

public class ExemploInteiro {

    public static void main(String[] args) {
        int numero1, numero2, soma;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;


        System.out.println(numero1 + " + " + numero2 +" = " + soma);
        sc.close();
    }

}
