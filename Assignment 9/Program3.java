//Accept N numbers from user and check whether that numbers contains 11 in it or not.

/*
    Input : N = 6
            Elements :  85  66  11  80  93  88  90

    Output : 11 is present.
*/

import java.util.*;

public class Program3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N numbers :");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 11) {
                System.out.println("11 is present.");
            }
        }
    }
}
