package org.vtorres.entites;

public class Conta {

    private long numeroDaConta;
    private String titular;
    private double saldo;

    public Conta() {
    }

    public Conta(long numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void depositar(Double valor) {
        if(valor >0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso! Novo saldo: "+ saldo);
        }else{
            System.out.println("Valor depositado invalido");
        }
    }

    public void sacar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        }else {
            System.out.println("Saldo insuficiente ou valor do saque invalido.");
        }
    }
}
