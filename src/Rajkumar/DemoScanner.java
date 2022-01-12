package Rajkumar;/* Created by IntelliJ IDEA.
 * Author: Raj kumar
 * Date: 04/08/20
 * Time: 09:22 PM
 * File: Rajkumar.DemoScanner.java
 */
// Step 1: import the Scanner class from the 'java.util' package.
import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args) {
        // Step 2: Create an object of the Scanner class
        // formula: to create an object of any class in Java
        // <ClassName> <objectName> = new <ClassName>();
        Scanner scannerObject = new Scanner(System.in);
        // Step 3: use the methods with the scanner object
        System.out.println("Hello rajkumar Please enter a number: ");
        int number = scannerObject.nextInt();
        // Step 4: close the scanner object after your input is finished
        scannerObject.close();
        // you can still use the value that you have saved in the variable
        System.out.println("Wel come rajkumar You entered: " + number);
    }
}