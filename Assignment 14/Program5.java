//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 3      iCol = 4

 Output :  1   2   3   4
           5   6   7   8
           9   10  11  12
*/

import java.util.Scanner;

public class Program5
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        int iNo = 1;
        for(int i=iRow; i>=1; i--)
        {
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(iNo+"  ");
                iNo++;
            }
            System.out.println();
        }
    }
    
}
