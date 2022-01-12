package Rajkumar;

import java.util.Scanner;

public class RajExu {
    public static void main(String[] args) {
        int sum = 0;
        Scanner Scan = new Scanner(System.in);
        ObjectRaj Obj = new ObjectRaj(25, 25, 58, 52, 45);//Constructor Call
        System.out.println("Enter Number:");
        Obj.setFirstNumber(Scan.nextInt());
        Obj.setSecondNumber(Scan.nextInt());
        Obj.setThirdNumber(Scan.nextInt());
        Obj.setFourNumber(Scan.nextInt());
        Obj.setFiveNumber(Scan.nextInt());
        sum += Obj.getFirstNumber() + Obj.getSecondNumber() + Obj.getThirdNumber() + Obj.getFourNumber() + Obj.getFiveNumber();//Getter Setter Call
        System.out.println("Total Number is: " + sum);
        Obj.sumOfNumber();


    }
}
