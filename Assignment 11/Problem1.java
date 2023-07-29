//Accept N number from user and display largest number from that.

/*
  Input : N = 6
          Elements = 85  66  96  45  29  88
          
  Output : 96
*/

import java.util.*;

public class Problem1 {
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
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}