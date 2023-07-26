//Accept N numbers from user and find the defference between summation of even elements and odd elements.

/*
 Input : N = 6
        85  66  3  80  93  88
        
Output : 53 (234-181)
*/

import java.util.*;
public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test cases: ");
        int t = sc.nextInt();

        System.out.println("Enter numbers.");
        int evenSum = 0;
        int oddSum = 0;
        int diff = 0;

        for(int i=0; i<t; i++)
        {
            int n1 = sc.nextInt();
            if(n1%2==0)
            {
                evenSum = evenSum+n1;
            }
            else 
            {
                oddSum = oddSum + n1;           
            }
        }
        diff = evenSum-oddSum;
        System.out.println("The difference between summation of even and odd number is : "+diff);  
    }
}