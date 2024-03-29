//Write a program which accept number from user and return the count of digits in between 3 and 7.

/*
  Input : 2395
  Output : 1
  
  Input : 1018
  Output : 0
*/

import java.util.Scanner;

public class Problem3 
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
            if(rem > 3 && rem < 7 )
            {
                count++;
            }
            iNo /= 10;
        }
        System.out.println(count);
    }
}
