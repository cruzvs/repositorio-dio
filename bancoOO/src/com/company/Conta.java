package com.company;


public class Conta {

    protected static final int  agenciaConta = 1;




    protected int conta ;
    protected int agencia;
    protected double saldo;


    public void deposito(double valor){
       this.saldo += valor;
    }

    public void sacar(double valor){
       this.saldo -= valor;
    }

    public void tranferir(double valor, Conta contaDestino){
        if (valor <= this.saldo){
            this.sacar(valor);
            contaDestino.deposito(valor);
        }else{
            System.out.printf("Valor menor que saldo! %n R$ %.2f%n " , this.saldo);
        }
    }







    public void infoConta(){
        System.out.println("========Conta=========");
        System.out.println("Numero Conta: " + this.conta );
        System.out.println("Numero Agência: " + this.agencia);
        System.out.printf( "Saldo R$ %.2f%n" , this.saldo);
        System.out.println("======================");

    }

}
