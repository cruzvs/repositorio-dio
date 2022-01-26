package com.company;

public class ContaCorrente extends Conta {

    protected static int numeroDeCC = 1;

    ContaCorrente(){
        super.agencia = Conta.agenciaConta;
        super.conta = ContaCorrente.numeroDeCC++;

    }

    @Override
    public void infoConta(){
        System.out.println("========Conta=========");

        System.out.println("Numero Conta Corrente: " + this.conta );
        System.out.println("Numero Agência: " + this.agencia);
        System.out.printf( "Saldo R$ %.2f%n" , this.saldo);
        System.out.println("======================");

    }



}
