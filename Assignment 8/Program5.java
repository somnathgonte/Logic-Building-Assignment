//Accept N numbers from user and display all such elements which are multiple of 11.

/*
 Input : N = 6;
         Elements : 55  66  15  80  93  88
         
 Output : 55  66  88
*/

import java.util.*;
public class Program5 
{
    public static void main(String[]arg)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number N : ");
        int N = obj.nextInt();

        int [] arr = new int[N];

        System.out.println("Enter "+N+" numbers: ");

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=obj.nextInt();
        }

        System.out.print("Output : ");
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%11==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
