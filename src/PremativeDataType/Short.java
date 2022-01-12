package PremativeDataType;

import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 24/07/2020
 *   Time: 04:30PM
 *   File: PremativeDataType.Short.java
 */
class Short{
    public static void main(String[] args) {
        short temperature;
        System.out.print("please enter the short value:");
        Scanner ScanObj=new Scanner(System.in);
        temperature=ScanObj.nextShort();
        ScanObj.close();
        System.out.println("you entred value:"+temperature);
    }
}
