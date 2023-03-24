//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.
//Input : 2395
//Output : -15  (2-17)

import java.util.*;
public class Lb7Problem5 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();
        int minus = 0;
        int sum1 = 0;
        int sum2 = 0;
        while(iNo1 != 0)
        {
            int rem = iNo1 % 10;
            if(rem%2==0)
            {
                sum1 += rem;
            }
            else 
            {
                sum2 += rem;
            }
            minus = sum1 - sum2;
            iNo1 /= 10;
        }
        System.out.println(minus);
    } 
}
