package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {
    public static void main (String[] args) {
        ContaCorrente conta_corrente = new ContaCorrente("felipe","0001", "0202", 0.0);

        System.out.println("Conta Especial");
        System.out.println("titular: " + conta_corrente.getTitular());
        System.out.println("Saldo: " + conta_corrente.calcularSaldo());

        ContaEspecial conta_especial = new ContaEspecial("lucas", "0001", "0505", 0, 1000.0);
        System.out.println("");
        System.out.println("Conta especial");
        System.out.println("titular: " + conta_especial.getTitular());
        System.out.println("Saldo: " + conta_especial.calcularSaldo());


    }
}
