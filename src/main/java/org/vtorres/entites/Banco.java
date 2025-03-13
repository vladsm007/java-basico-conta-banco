package org.vtorres.entites;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta acidiona com sucesso. ");
    }

    public Conta buscarConta(int numeroConta){
        for (Conta conta :contas) {
            if (conta.getNumeroDaConta() == numeroConta){
                return conta;
            }
        }
        return null;
    }

    public void removerConta(int numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta removida com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

}
