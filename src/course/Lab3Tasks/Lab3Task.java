/* Created by IntelliJ IDEA.
 * Author: Raj kumar
 * Date: 31/07/20
 * Time: 8:58 PM
 * File: Lab3Task.java
 */
package course.Lab3Tasks;
import java.util.Scanner;
public class Lab3Task{
    public static final String DISCOUNT_CODE = "CoVid19";
    public static void main(String[] args) {
        Scanner SannerObject = new Scanner(System.in);
        System.out.println("clientInputDiscountCode");
        String clint = SannerObject.nextLine();
        if (clint.matches(DISCOUNT_CODE) | clint.matches(DISCOUNT_CODE.toLowerCase()) | (clint.matches(DISCOUNT_CODE.toUpperCase()))) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        }
        else if(clint.isBlank() & clint.isEmpty()){
            System.out.println("The coupon code cannot be blank or empty");
        }

    }


}
