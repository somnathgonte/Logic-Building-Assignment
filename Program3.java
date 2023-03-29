//Accept one number from user and print that number of even numbers on screen
//Input : 7
//Output : 2 4 6 8 10 12 14 

import java.util.*;
public class Program3 
{
    public static void printEven(int num)
    {
        for(int i =1;i<=num;i++)
        {
            System.out.print(2*i+" ");
        }
    }
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();
        printEven(iNo1);
    }
}
