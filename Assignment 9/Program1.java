//Accept N numbers from user and return frequency of even elements.

/*
    Input : N = 6
            Elements :  85  66  3  80  93  88

    Output : 3
*/
    
import java.util.*;
public class Program1
{
    public static void main(String[] arg)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int N = obj.nextInt();
        int count = 0;
        
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
                count++;
            }
        }
        System.out.print(count);
    }
}