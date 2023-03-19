//Accept one number from user and display first number in second number of times
//Input : 12  5
//Output : 12  12  12  12  12 

import java.util.*;
public class Program1 
{
    public static void display(int num1,int num2)
    {
        if(num2<0)
        {
            num2 = -num2;
        }
        for(int i = 1; i<=num2;i++)
        {
            System.out.print(num1+" ");
        }
    }
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();

        display(iNo1,iNo2);
    }
    
}
