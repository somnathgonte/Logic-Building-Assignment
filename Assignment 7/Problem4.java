//Write a program which accept number from user and return the multiplication of all digit.

/*
  Input : 2395
  Output : 270
  
  Input : 1018
  Output : 8
*/

import java.util.Scanner;

public class Problem4 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo = sc.nextInt();

        int multi = 1;
        while(iNo != 0)
        {
            int rem = iNo % 10;
            
            if(rem != 0)
            {
               multi = multi * rem;
            }

            iNo /= 10;
        }
        System.out.println(multi);
    }
    
}
