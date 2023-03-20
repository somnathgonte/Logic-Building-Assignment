//Accept number from user and display its factors in decreasing order.
//Input : 12
//Output : 6 4 3 2 1

import java.util.*;
public class Lb4Problem2 
{
    public static void displayFactor(int num)
    {
        for(int i = num/2; i>=1;i--)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();
        displayFactor(iNo);
    }
}
