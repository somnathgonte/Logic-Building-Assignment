//Accept N numbers from user and accept one another number as No, return frequency of No from it..

/*
    Input : N : 6
            NO : 66
            Elements :  85  66  11  80  66  88  

    Output : 2.

    Input : N : 6
            NO : 66
            Elements :  85  65  82  80  111  88 

    Output : 0.
*/

import java.util.*;
public class Program5 
{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N numbers :");
        int N = sc.nextInt();

        System.out.println("Enter NO number : ");
        int NO = sc.nextInt();

        int count = 0;

        int[] arr = new int[N];

        System.out.println("Enter " + N + " elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == NO) {
                count++;
            }
        }

        System.out.println(count);
    }
}
