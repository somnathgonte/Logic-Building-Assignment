//Write a program which accept number from user and return the summation of it's non-factor.

/*
  Input : 12
  Output : 50 (5+7+8+9+10+11) 
*/

import java.util.*;
public class Problem4 
{

    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sc.nextInt();
        int sum = 0;

        for(int i=1; i<iNo; i++)
        {
            if(iNo%i != 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
