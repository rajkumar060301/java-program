import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scannerObject.nextInt();
        scannerObject.close();
        System.out.println("your entered number:" + number);
    }
}