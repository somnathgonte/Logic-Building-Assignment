//Accept N numbers from user and display summation of digits of each number.

/*
   Input : N : 6
           Element :  8225  665  3  76  953  858 

    Output : 17  17  3  13  17  21
*/

import java.util.Scanner;

public class Problem5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter " + N + " elements : ");

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output : ");

        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            while(arr[i]>0)
            {
                int rem = arr[i] % 10;
                sum = sum + rem;
                arr[i] /= 10;
            }
            System.out.print(sum+" ");
        }




    }
    
}
