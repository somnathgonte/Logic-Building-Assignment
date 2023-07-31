//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 4      iCol = 4

 Output :  A   B   C   D    
           a   b   c   d   
           A   B   C   D 
           a   b   c   d  
*/

import java.util.Scanner;

public class Program2 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        

        for(int i=1; i<=iRow; i++)
        {
            char ch1 = 'A';
            char ch2 = 'a';
            for(int j=1; j<=iCol; j++)
            {
                if(i%2==0)
                {
                    System.out.print(ch2+" ");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+" ");
                    ch1++;
                }
            }
            System.out.println();
        }
    }
}
