package Pattern;

public class RhombusStars {
    public static  void HollowPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++)
                    System.out.print(" ");
                for (int j = 0; j <n; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    public static void main(String[] args) {
        int num = 5;
        HollowPattern(num);
    }
}
