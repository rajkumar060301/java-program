package PremativeDataType;

import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 24/07/2020
 *   Time: 04:30PM
 *   File: PremativeDataType.Boolean.java
 */
class Boolean{
    public static void main(String[] args) {
        Scanner ScanObj=new Scanner(System.in);
        System.out.print("Enter boolean value in(true or alse):");
        boolean flag=ScanObj.nextBoolean();
        ScanObj.close();
        System.out.println("your entred value:"+flag);
    }
}