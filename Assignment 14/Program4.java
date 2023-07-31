//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 4     iCol = 5

 Output :  4   4   4   4   4       
           3   3   3   3   3 
           2   2   2   2   2
           1   1   1   1   1
*/

import java.util.Scanner;

public class Program4 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        
        for(int i=iRow; i>=1; i--)
        {
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
