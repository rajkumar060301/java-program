package Rajkumar;

import java.math.BigInteger;
import java.util.Scanner;


public class UseScan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String Name;
        BigInteger ContactNumber;
        int percentage;
        boolean HostalChoose=false;
        int year;
        String Section;
        int ClassRollNumber;
        int UniverstyRollNumber;
        String Course;
        System.out.print("please enter your name:");
        Name= scan.next();
        System.out.println("Student Name: "+Name);
        System.out.print("enter your father's Name:");
        Name=scan.next();
        System.out.println("Father's Name: "+Name);
        System.out.print("please enter your mother's name:");
        Name=scan.next();
        System.out.println("Mother's Name: "+Name);
        System.out.print("please enter your permanent address:");
        Name=scan.next();
        System.out.println("Permanent Address: "+Name);
        System.out.print("please enter your contact number:");
        ContactNumber=scan.nextBigInteger();
        System.out.println("Student's Contact Number: "+ContactNumber);
        System.out.print("please enter your father;s number:");
        ContactNumber=scan.nextBigInteger();
        System.out.println("Father's Contact Number: "+ContactNumber);
        System.out.print("please enter mother's contact Number:");
        ContactNumber=scan.nextBigInteger();
        System.out.println("Mother's Contact Number: "+ContactNumber);
        System.out.print("percentage in 10th:");
        percentage=scan.nextInt();
        System.out.print("percentage in 12th:");
        percentage=scan.nextInt();
        System.out.println("Hostal Choose: "+HostalChoose);
        System.out.print("Enter which is read in year course:");
        year=scan.nextInt();
        System.out.println("year: "+year);
        System.out.print("enter section:");
        Section=scan.next();
        System.out.print("enter class roll number:");
        ClassRollNumber=scan.nextInt();
        System.out.println("Class Roll Number: "+ClassRollNumber);
        System.out.print("enter your university roll number:");
        UniverstyRollNumber=scan.nextInt();
        System.out.println("University Roll Number: "+UniverstyRollNumber);
        System.out.print("Enter your course:");
        Course=scan.next();

    }


}
