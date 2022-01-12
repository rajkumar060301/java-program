package EceptionHandling;

import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) {
        // Syntax error
        /*
        System.out.println("main method started");
        int a=45;
        int b = 0;
        int c;
        try {
            c= a/b;
            System.out.println(c);

        }
        catch (ArithmeticException e){
            System.out.println("Execption handling");
        }
        System.out.println("main method end");
         */
        //logical error

        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);


        //Runtime error
        int k;
        Scanner scanner= new Scanner(System.in);
        k = scanner.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);


        }

    }


}
