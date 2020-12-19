import java.util.Scanner;

public class oprator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int result;
        System.out.print("Enter the Number:");
        num = scan.nextInt();
        for(int i =1;i<=10;i++){
            result=num*i;
            System.out.println(num+" "+"*"+" "+i+" "+"="+" "+result);
            if(result>=40) {
                break;
            }
        }
    }
}
