//Accept number from user and display its multiplication of factors.
//Input : 12
//Output : 144 (1*2*3*4*6*12)

import java.util.*;
public class Lb4Problem1 
{
    public static void multiFactor(int num)
    {
        int multiply = 1;
        for(int i=1; i<=num/2; i++)
        {
            if(num%i==0)
            {
                 multiply *= i;
            }
        }
        System.out.println(multiply);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();
        multiFactor(iNo);
    }
}
