package entities;

public class Hours {

    public static void hours(int a){
        if ( a >= 6 && a <= 12) {morning();}
        else if (a >= 13 && a <= 17 ){evening();}
        else {night();};
    }
    public static void morning(){
        System.out.println("Good Morning!!");
    }

    public static void evening(){
        System.out.println("Good Evening!!");
    }
    public static void night(){
        System.out.println("Good Night!!");
    }

}
