package Pattern;

public class HollowRhombusStars {
    public  static  void HollowRhombus(int num){
        for (int i = 0; i <=num; i++) {
            for (int j = 0; j <= num-i;  j++)
                System.out.print(" ");
            if (i==1 || i==num)
                for (int j=1; j<=num; j++)
                    System.out.print("*");
            else
                for (int j=1; j<=num; j++)
                    if (j==1 || j==num)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            // Move to the next line/row
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number = 5;
        HollowRhombus(number);
    }
}
