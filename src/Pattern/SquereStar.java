package Pattern;
//Write a  program in java print squre star using enter the number

import java.util.Scanner;

public class SquereStar {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the row : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 1; i <=number-1; i++) {
            for (int j = 1; j <=number ; j++) {

                    System.out.print("*");

            }
            System.out.println("*");

        }

    }
}
