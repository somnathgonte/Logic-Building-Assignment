//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 3       iCol = 5

 Output :  1   1   1   1  
           2   2   2   2 
           3   3   3   3 
           4   4   4   4 
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

        for(int i=1; i<=iRow; i++)
        {
            for(int j=1; j<=iCol; j++)
            {
                 System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
