import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Private obj = new Private("Rajkumar",132445,"xyz@gmail.com",1234567890);
        obj.raj();
        System.out.println("Enter Your Name:");
        obj.setName(scan.nextLine());
        System.out.println("Enter Your Roll No.");
        obj.setRoll_no(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter Your Email:");
        obj.setEmail(scan.nextLine());
        System.out.println("Enter Your Mobile No.");
        obj.setMobile_no(scan.nextLong());
        System.out.println("Name :"+obj.getName());
        System.out.println("Roll No :"+obj.getRoll_no());
        System.out.println("Email :"+obj.getEmail());
        System.out.println("Mobile No:"+obj.getMobile_no());
    }
}
