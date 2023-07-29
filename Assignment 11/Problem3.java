//Accept N number from user and display the differance between smallest number and largest number from that.

/*
  Input : N = 6
          Elements = 85  66  96  3  29  88
          
  Output : 93 (96-3)
*/

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter " + N + " elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest - smallest);
    }
}
