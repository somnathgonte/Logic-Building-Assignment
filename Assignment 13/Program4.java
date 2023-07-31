//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 3       iCol = 4

 Output :  *   #   *   #    
           *   #   *   #   
           *   #   *   #   
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

        for(int i=1; i<=iRow; i++)
        {
            for(int j=1; j<=iCol; j++)
            {
                if(j%2==0)
                {
                    System.out.print('#'+" ");
                }
                else 
                {
                    System.out.print('*'+" ");
                }
            }
            System.out.println();
        }
    }    
}
