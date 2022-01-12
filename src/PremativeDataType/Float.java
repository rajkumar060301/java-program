package PremativeDataType;

import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 24/07/2020
 *   Time: 04:30PM
 *   File: PremativeDataType.Float.java
 */
class Float{
    public static void main(String[] args) {
        float number;
        System.out.print("Enter float value:");
        Scanner ScanObj=new Scanner(System.in);
        number=ScanObj.nextFloat();
        ScanObj.close();
        System.out.println("you enter float value:"+number);
    }
}