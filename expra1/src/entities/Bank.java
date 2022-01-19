package entities;

public class Bank {
    public static double bankChange(){
        return 0.20;
    }

    public static double secondBankChange(){
        return 0.40;
    }

    public static void calcFinal(double value, int months ){
        double result;
        if (months == 12) {
            result = value + (value * bankChange());
        }else{
        result = value + (value * secondBankChange());
        }

        System.out.print("Valor final é R$" + result);
    }

}
