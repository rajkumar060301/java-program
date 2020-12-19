/*  Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 14/07/20
 *   Time: 12:29 PM
 *   File: DemoCommandLineArguments.java
 */

public class DemoCommandLineArguments {
    public static void main(String[] args) {
        /*
         * All the arguments you provide as command line arguments will
         * be stored in the args array. Remember, it is a String-type array!
         * */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}