//Write a program which accept number from user and return multiplication of all digits.
//Input: 2395
//Output: 270


import java.util.*;
public class Lb7Problem4
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();

        int multi = 1;
        int count = 0;
        while(iNo !=  0)
        {
            int rem = iNo%10;
            if(rem != 0)
            {
               multi *= rem;
            }
            iNo /= 10;
        }
        System.out.println(multi);
    }
}
