/*
    Write a program input number under 10 then result given else try again.
    Using switch case
 */




package Rajkumar;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        int num;
        System.out.print("Enter the number(Max range=10) :");
        num = raj.nextInt();
        if(num<=10){
            for(int i =1;i<=num;i++){
                if(i%2==0){
                    switch (i){
                        case 2:
                            System.out.println("two");
                            break;
                        case 4:
                            System.out.println("four");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 10:
                            System.out.println("ten");
                            break;
                        default:
                            System.out.println("Please Enter valid Number");
                    }
                }

            }
        }
        else{
            System.out.println("Try Again");
        }
    }
}
