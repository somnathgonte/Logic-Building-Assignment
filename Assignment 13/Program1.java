//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 4       iCol = 3

 Output :  *   *   * 
           *   *   *
           *   *   *
           *   *   *
*/

import java.util.*;
public class Program1
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();

        for(int i=0; i<iRow; i++)
        {
            for(int j=0; j<iCol; j++)
            {
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}