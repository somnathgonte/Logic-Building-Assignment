//Write a program which accept number from user and return the count of even digits.

/*
  Input : 2395
  Output : 1
  
  Input : 1018
  Output : 2
*/

import java.util.*;
public class Problem1
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo = sc.nextInt();
        int count = 0;

        while(iNo != 0)
        {
            int rem = iNo % 10;
            if(iNo%2 == 0)
            {
                count++;
            }
            iNo /= 10;
        }
        System.out.println(count);
    }
}