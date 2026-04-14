package model;

public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(String titular, String agencia, String numeroConta, double saldo, double limite) {
        super(titular, agencia, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public double calcularSaldo() {
        double saldoFinal;

        saldoFinal = super.calcularSaldo() + limite;
        return saldoFinal;
    }
}

