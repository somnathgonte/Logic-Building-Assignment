//Write a program which accept number from user and return the count of even digits.
//Input: 2395
//Output: 1


import java.util.*;
public class Demo
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();

        int count = 0;
        while(iNo !=  0)
        {
            int rem = iNo%10;
            if(rem%2 == 0)
            {
                count++;
            }
            iNo /= 10;
        }
        System.out.println(count);
    }
}
