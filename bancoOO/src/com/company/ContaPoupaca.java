package com.company;

public class ContaPoupaca extends Conta{

    protected static int numeroDeCP = 1;

    ContaPoupaca(){
        super.agencia = Conta.agenciaConta;
        super.conta = ContaPoupaca.numeroDeCP++;

    }

    @Override
    public void infoConta(){
        System.out.println("========Conta=========");
        System.out.println("Numero Conta Popança: " + this.conta );
        System.out.println("Numero Agência: " + this.agencia);
        System.out.printf( "Saldo R$ %.2f%n" , this.saldo);
        System.out.println("======================");

    }



}
