//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.

/*
  Input : 2395
  Output : -15
  
  Input : 1018
  Output : 6
*/

import java.util.Scanner;

public class Problem5 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int totalDiff = 0;

        while(iNo != 0)
        {
            int rem = iNo%10;
            if(rem % 2 == 0)
            {
                evenSum = evenSum + rem;
            }
            else 
            {
                oddSum = oddSum + rem;
            }
            iNo /= 10;
        }
        totalDiff = evenSum - oddSum;
        System.out.println(totalDiff);
    }   
}
