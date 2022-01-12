package Pattern;

public class SqureStars {
    public  static void Stars(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int number =5;
        Stars(number);
    }
}
