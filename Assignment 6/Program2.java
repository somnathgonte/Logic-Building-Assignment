//Write a program which accept number from user and check whether it contains zero or not.

/*
 Input : 2036
 Output : It's contains zero.
 
 Input : 5236
 Output : It's not contain zero.
*/

import java.util.*;
public class Program2 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo1 = sc.nextInt();

        checkZero(iNo1);
    }

    public static void checkZero(int no)
    {
        while(no != 0)
        {
            int rem = no %10;
            if(rem == 0)
            {
                System.out.println("It's contain zero.");
            }
            else
            {
                System.out.println("There is no zero.");
            }
            no /= 10;
        }
    }
}
