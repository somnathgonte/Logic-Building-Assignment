//Write a program which accept number from user and display it's non-factor

/*
  Input : 12
  Output : 5 7 8 9 10 11 
*/

import java.util.*;
public class Program3 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sc.nextInt();

        for(int i=1; i<iNo; i++)
        {
            if(iNo%i != 0)
            {
                System.out.println(i);
            }
        }
    }
}
