package course;

import java.util.Scanner;

class stringBuilderDemo {
    public static void main(String[] args) {
        System.out.println("please Enter your first name: ");
        Scanner scannerObject = new Scanner(System.in);
        String firstName = scannerObject.nextLine();
        System.out.println("please Enter your second name: ");
        String middleName = scannerObject.nextLine();
        System.out.println("please Enter your Last name: ");
        String lastName = scannerObject.nextLine();
        System.out.println("please Enter your date of birth (not mention month and year: ");
        int dateOfBirth = scannerObject.nextInt();
        System.out.println("please Enter your month of birth: ");
        int monthOfBirth = scannerObject.nextInt();
        System.out.println("please Enter your year of birth: ");
        int yearOfBirth = scannerObject.nextInt();
        StringBuilder systemGeneratedPassword = new StringBuilder();
        // firstName.lastName@monthOfBirth_yearOfBirth*dateOfBirth
        // raj.singh@3_2001*06
        // ""
        systemGeneratedPassword.append(firstName);
        // "" + "raj" => "raj"
        systemGeneratedPassword.append(".");
        // "raj" + "." => "raj."
        systemGeneratedPassword.append(lastName);
        // "raj." + "singh" => raj.singh
        systemGeneratedPassword.append("@");
        // "raj.sing" + "@" => raj.singh@
        systemGeneratedPassword.append(monthOfBirth);
        // "raj.sing@" + "3" => raj.singh@3
        systemGeneratedPassword.append("_");
        // "raj.singh@3" + "_" => raj.singh@3_
        systemGeneratedPassword.append(yearOfBirth);
        // "raj.singh@3_2001" + "2001" => raj.singh@3_2001
        systemGeneratedPassword.append("*");
        // "raj.singh@3_2001" + "*" => raj.singh@3_2001*
        systemGeneratedPassword.append(dateOfBirth);
        // "raj.singh@3_2001*" + "06" => raj.singh@3_2001*06

        // create Encryption password
        // AES : Advanced Encryption Standard AES:TKIP, WPA, WPA2, WPA2PSK
        String password = "rajkumar";
        for (int index = 0; index < password.length(); index++) {
            char character = password.charAt(index);
            character = (char) (character + 2);
            System.out.print(character);

        }
    }

}
