package Rajkumar;


import java.util.Scanner;

public class ArrayImplemantation {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size = scan.nextInt();
        int[] arr = new int[size];
        /*This is input by user
        here size of array depends on user
         */
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        ArrayImplemantation obj = new ArrayImplemantation();
        obj.findingElement(arr);

    }

    public void findingElement(int[] Arr) {
        System.out.print("Element :");
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 4 == 0) {
                System.out.print(Arr[i] + " ");
            }
        }
    }

}
