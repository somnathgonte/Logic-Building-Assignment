//Accept N number from user and display such a number which contains 3 digit in it.

/*
  Input : N = 6
          Elements = 852  66  96  3  295  88
          
  Output : 852  295
*/

import java.util.Scanner;

public class Problem4 
{
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=100 && arr[i]<=999) 
            {
                System.out.println(arr[i]);
            }
        }
    }
}
