package com.company;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupaca();
        cc.infoConta();
        cp.infoConta();
        cc.deposito(1000);
        cc.tranferir(500,cp);
        cc.sacar(500);
        cc.infoConta();
        cp.infoConta();


    }
}
