package Pattern;
// Java program to print diagonal star patterns

import java.lang.*;

public class SqureDiagional {
    public static void pattern(int n)
    {
        // Loop denoting rows
        for (int i = 0; i < n; i++) {
            // Loop denoting columns
            for (int j = 0; j < n; j++) {
                // Checking boundary conditions
                // and main diagonal and
                // secondary diagonal conditions
                if (i == 0 || j == 0 || i == j
                        || i == n - 1 || j == n - 1
                        || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    // Driver function
    public static void main(String argc[]){
        // n denotes size which should be odd
        int n = 7;
        // Function calling
        pattern(n);
    }
}
// This code is contributed by Sagar Shukla
