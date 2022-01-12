/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 28/12/2020
 *   Time: 04:30PM
 *   File: PremativeDataType.Boolean.java
 */
package Arithmetic;

import java.util.Scanner;

public class BasicClc {

    public static void main(String[] args) {
        int Addition, Substraction, Multiplaction;
        float Division;
        Scanner ScanObj = new Scanner(System.in);
        System.out.print("Enter frist Number:");
        int A = ScanObj.nextInt();
        System.out.print("Enter second Number");
        int B = ScanObj.nextInt();
        Addition = A + B;
        Substraction = A - B;
        Multiplaction = A * B;
        Division = A / 2;
        System.out.println("ddition: " + Addition);
        System.out.println("Substraction :" + Substraction);
        System.out.println("Multiplaction :" + Multiplaction);
        System.out.println("Division :" + Division);


    }
}
