//Write a program which accept number from user and display it's multiplication factor.

/*
  Input :   12
  Output : 144(1*2*3*4*6)

  Input : 13
  Output : 1
*/

import java.util.*;
public class Program1 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int iNo = sc.nextInt();
        int multi = 1;

        for(int i=1; i<=iNo/2; i++)
        {
            if(iNo % i==0)
            {
                multi = multi * i;
            }
        }
        System.out.println(multi);
    }
    
}
