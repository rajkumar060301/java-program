package Rajkumar;

import java.util.Scanner;
//definition class
public class Information {
    //field attributes properties
    private String Name;
    private int roll_no;
    private String Email;
    private long mobile_no;
    private  String Course;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Information(String name, int Roll, String email, long mobile, String course){//this is a constructor
        Name=name;
        roll_no = Roll;
        Email = email;
        mobile_no = mobile;
        course = Course;
    }
    public void raj(){  //This is a method
        System.out.println("Name :"+Name);
        System.out.println("Roll_No. :"+roll_no);
        System.out.println("Email :"+Email);
        System.out.println("Mobile No. :"+mobile_no);
        System.out.println("Course" + Course);
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Information obj = new Information("Rajkumar",132445,"xyz@gmail.com",1234567890,"CSE");
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
        System.out.println("Enter Course");
        obj.setCourse(scan.nextLine());
        System.out.println("Name :"+obj.getName());
        System.out.println("Roll No :"+obj.getRoll_no());
        System.out.println("Email :"+obj.getEmail());
        System.out.println("Mobile No :"+obj.getMobile_no());
        System.out.println("Course :" +obj.getCourse());
    }

}
