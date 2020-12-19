import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner raj=new Scanner(System.in);
        String str1;
        System.out.println("Enter str1(min length 5):");
        str1=raj.nextLine();
        String str2;
        System.out.println("Enter str2(min length 5):");
        str2 =raj.nextLine();
        if(str1.length()>=5 && str2.length()>=5){
            System.out.println(str1.length());
            System.out.println(str2.length());
            System.out.println(str1.equals(str2));
            System.out.println(str1.equalsIgnoreCase(str2));
            System.out.println(str1.charAt(3));
            System.out.println(str2.charAt(4));

        }




    }
}
