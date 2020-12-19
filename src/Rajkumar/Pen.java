import javax.swing.*;
import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what you want be in your life");
        System.out.println("If doctor than enter D .......???\nYou want be an Engineering Than Press E......???");
        String a = sc.next();

        if (a.equalsIgnoreCase("d")) {
            System.out.println("Hey you most Welcome to the Doctor department");
            System.out.println("Have you any quarry about the doctor \nIf yes than press y\n Other wise press N to continue");
            String c=sc.next();
            if(c.equalsIgnoreCase("y")) {
                System.out.println("We will waiting your quary ????");
                System.out.println("Start typing .........");
                String doctor = sc.nextLine();

                System.out.println("thnaks for conecting us");
            }
            else if(c.equalsIgnoreCase("n"))
            {
                System.out.println("I hope you have no any query about doctor");
            }
            else{
                System.out.println("ohoo! you press wrong keyword");
            }
        }
        else if(a.equalsIgnoreCase("e")){
            System.out.print("Welcome to the Engineering department");
            System.out.println("You have any quarry about the Engineering");
            System.out.println("if yes than press Y\nOtherwise press N to continue");
            String g=sc.next();
            if (g.equalsIgnoreCase("y")){
                System.out.println("please enter your quarry");
                System.out.println("We will waiting for your responsed");
                String h=sc.next();
                System.out.println("Thanks for connecting us! \n \t\tHAVE A GOOD DAY");

            }
        }
        else
            System.out.println("you are Enter a unknown option");

    }
}