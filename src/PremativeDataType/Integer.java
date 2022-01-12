package PremativeDataType;/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: ${24/07/2020}
 *   Time: ${04:30PM}
 *   File: ${PremativeDataType.Integer}.java
 */

import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scannerObject.nextInt();
        scannerObject.close();
        System.out.println("your entered number:" + number);
    }
}


