//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 4       iCol = 3

 Output :  1   2   3 
           1   2   3
           1   2   3
           1   2   3
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
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    
}
