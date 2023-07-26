//Accept N numbers from user and display all such elements which are divisible by 5.

/*
 Input : N = 6;
         Elements : 85  66  3  80  93  88
         
 Output : 85  50
*/

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Enter the value of N: ");
        N = scanner.nextInt();

        int[] arr = new int[N];

        System.out.print("Enter " + N + " numbers: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Output: ");

        for (int i = 0; i < N; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}