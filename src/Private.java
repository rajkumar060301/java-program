import java.util.Scanner;

public class Private {
    private String Name;
    private int roll_no;
    private String Email;
    private long mobile_no;
    public Private(String name,int Roll,String email,long mobile){//this is a constructor
        Name=name;
        roll_no=Roll;
        Email=email;
        mobile_no=mobile;
    }
    public void raj(){//This is a method
        System.out.println("Name :"+Name);
        System.out.println("Roll_No. :"+roll_no);
        System.out.println("Email :"+Email);
        System.out.println("Mobile No. :"+mobile_no);
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
