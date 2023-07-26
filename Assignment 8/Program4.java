//Accept N numbers from user and display all such elements which are divisible by 5 and 3.

/*
 Input : N = 6;
         Elements : 85  66  15  80  93  88
         
 Output : 15
*/

import java.util.Scanner;

public class Program4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n :");

        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " numbers : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output : ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" are the numbers which are divisible by 5 and 3");
    }
    
}
