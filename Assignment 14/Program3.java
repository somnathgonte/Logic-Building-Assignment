//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 3     iCol = 5

 Output :  A   A   A   A   A
           B   B   B   B   B
           C   C   C   C   C 
*/

import java.util.Scanner;

public class Program3 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        

        char ch1 = 'A';
        for(int i=1; i<=iRow; i++)
        {
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(ch1+" ");
            }
            System.out.println();
            ch1++;
        }
    }
    
}
