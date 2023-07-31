//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 3       iCol = 5

 Output :  5   4   3   2   1 
           5   4   3   2   1
           5   4   3   2   1
           5   4   3   2   1
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

        for(int i=1; i<=iRow; i++)
        {
            for(int j=iCol; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
