//Accept a number from user find the difference between summation of it's factors and non-factors.

/*
  Input : 12
  Output : -34 
*/

import java.util.*;
public class Problem5 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sc.nextInt();

        int sumOfFactors=0;
        int sumOfNonFactors = 0;

        for(int i=1; i<iNo; i++)
        {
            if(iNo%i==0)
            {
                sumOfFactors = sumOfFactors + i; 
            }
            else 
            {
                sumOfNonFactors = sumOfNonFactors + i; 
            }
        }
        int difference = sumOfFactors - sumOfNonFactors;
        System.out.println(difference);
    }
}
