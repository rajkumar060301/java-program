/* Created by IntelliJ IDEA.
 * Author: Divyansh Bhardwaj (dbc2201)
 * Date: 01/08/20
 * Time: 1:47 PM
 * File: Lab5Task.java
 */
package course.lab.labTasks.lab5;

/**
 * Create a program in Java to create OTP (One-Time Passwords) for a
 * customer service.
 */
public class Lab5Task {
    private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

    /**
     * This method generates an OTP for the customer depending upon
     * the number of digits.
     *
     * @return the generated OTP.
     */
    private static int generateOTP() {
        int NumberOfdigits = 6;
        // TODO create an `int` variable to store the number of digits in OTP and set it to 6.
        int otp = 0;
        for (int LoopVariable = 0; LoopVariable < 6; LoopVariable++) {
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int Power = (int) Math.pow(10.0, LoopVariable);
            Power = randomNumber * Power;
            otp = otp + Power;
        }
        return otp;
    }

    /**
     * This method generates a random number between 0 and 9 for the
     * OTP.
     *
     * @return a random number between 0 and 9.
     */
    private static int createRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }

    /**
     * This method prints the generated OTP with some dashes between
     * the characters.
     *
     * @param generatedOTP the random OTP generated from the
     *                     generateOTP method.
     */
    private static void printOTP(int generatedOTP) {
        String otpString = String.valueOf(generatedOTP);
        for (int i = 0; i < otpString.length(); i++) {
            System.out.print(otpString.charAt(i) + (i <
                    otpString.length() - 1 ? "-" : ""));
        }
    }

    public static void main(String[] args) {
        int generatedOTP = generateOTP();
        System.out.print("Your OTP is : ");
        printOTP(generatedOTP);
    }
}