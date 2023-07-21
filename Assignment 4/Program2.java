//Write a program which accept number from user and display it's factors in decresing order.

/*
  Input : 12
  Output : 6
           4 
           3 
           2 
           1    
*/
import java.util.*;
public class Program2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int iNo = sc.nextInt();

        for(int i = iNo/2; i>=1; i--)
        {
            if(iNo%i==0)
            {
                System.out.println(i);
            }
        }
    }  
}
