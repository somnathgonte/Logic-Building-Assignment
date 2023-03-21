//Write a program which accept number from user and display its digits in reverse order
//Input : 2395
//Output : 5
        // 9
        // 3 
        // 2

import java.util.*;
public class Lb6Problem1
{
    public static void reverseDigit(int num)
    {
        if(num<0)
        {
            num = -num;
        }
        while(num != 0)
        {
            int rem = num%10;
            System.out.println(rem);
            num = num/10;
        }
    }
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();
        reverseDigit(iNo);
    }
}