//Write a program which accept number from user and count the frequency of 4 in it.

/*
  Input : 325649;
  Output : 1

  Input : 9000
  Output : 0
*/

import java.util.Scanner;

public class Program4 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo1 = sc.nextInt();

        Program4 p4 = new Program4();    //create object for reference to create non static method.

        int count = p4.checkFour(iNo1);   //p4 is referance of object.
        System.out.println(count);
    }

    public int checkFour(int no)
    {
        int count = 0;
         while(no != 0)
        {
            int rem = no % 10;
            if(rem==4)
            {
                count++;
            }
            no/=10;
        }
        return count;
    }
}
