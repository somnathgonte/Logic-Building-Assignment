//Write a program which accept number from user count a frequency of such number which is less than 6.

/*
  Input : 325649;
  Output : 4

  Input : 9064
  Output : 2
*/

import java.util.Scanner;

public class Program5 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo1 = sc.nextInt();
        int count = countSix(iNo1);
        System.out.println(count);
    }

    public static int countSix(int iNo1) 
    {
        int count = 0;
         while(iNo1 != 0)
        {
            int rem = iNo1 % 10;
            if(rem < 6)
            {
                count++;
            }
            iNo1/=10;
        }
        return count;
    }  
}
