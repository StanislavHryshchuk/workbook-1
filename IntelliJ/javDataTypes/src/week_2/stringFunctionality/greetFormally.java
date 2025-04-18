package week_2.stringFunctionality;

import java.util.Scanner;

public class greetFormally {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        formalGreet();

        System.out.println(formalGreet1());


        String name1 = "Stan";
        String name2 = "Linda";
        System.out.println(formalGreet2(name1, name2)); ;


    }

    public static void formalGreet () {
        //System.out.println("please enter your name:");
        int b = 13 + 15;
        System.out.println(b);
    }

    public static String formalGreet1(){

        String name = "Linda";

        return name;
    }

    public static String formalGreet2(String name1, String name2){

        String name4 = name1;
        String name3 = name2;

        return name3 + name4;
    }
}
