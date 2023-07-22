//Write a program which accept number from user and count the frequency of 2 in it.

/*
  Input : 32569;
  Output : 1

  Input : 9000
  Output : 0
*/

import java.util.*;
public class Program3 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo1 = sc.nextInt();
        int count = checkTwo(iNo1);
        System.out.println(count);
    }

    public static int checkTwo(int no)
    {
        int count = 0;
         while(no != 0)
        {
            int rem = no % 10;
            if(rem==2)
            {
                count++;
            }
            no/=10;
        }
        return count;
    }
}
