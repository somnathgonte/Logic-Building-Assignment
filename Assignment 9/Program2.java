//Accept N numbers from user and return difference the frequency of even elements and odd elements.

/*
    Input : N = 6
            Elements :  85  66  3  80  93  88  90

    Output : 1(4-3)
*/

import java.util.Scanner;

public class Program2 
{
    public static void main(String[] arg)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int N = obj.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        
        int [] arr = new int[N];
        System.out.println("Enter "+N+" elements :");

        for(int i=0; i<arr.length; i++)
        {
            arr[i]= obj.nextInt();
        }
        System.out.print("Output :");
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                evenCount++;
            }
            else 
            {
                oddCount++;
            }
        }
        int diff = evenCount - oddCount;
        System.out.println(diff);
    }
}
