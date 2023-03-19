//Accept one from user and print that number * on screen

import java.util.*;
public class Program2
{
    public static void display(int num)
    {
        for(int i = 1; i<=num;i++)
        {
            System.out.print("* ");
        }
    }
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int iNo1 = sc.nextInt();
        display(iNo1);
    }
}
