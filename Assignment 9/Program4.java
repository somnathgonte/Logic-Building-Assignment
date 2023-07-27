//Accept N numbers from user and and return frequency of 11 in it..

/*
    Input : N = 6
            Elements :  85  66  11  80  111  88  11

    Output : 2.

    Input : N = 6
            Elements :  85  66  82  80  111  88  10

    Output : 0.
*/

import java.util.*;

public class Program4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N numbers :");
        int N = sc.nextInt();
        int count = 0;

        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 11) {
                count++;
            }
        }
        System.out.println(count);
    }
}
