package PremativeDataType;

import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 24/07/2020
 *   Time: 04:30PM
 *   File: PremativeDataType.Long.java
 */
class Long{
    public static void main(String[] args) {
        long range;
        System.out.println("Enter long type value:");
        Scanner ScanObj=new Scanner(System.in);
        range=ScanObj.nextLong();
        ScanObj.close();
        System.out.println("you entred long range:"+range);
    }
}