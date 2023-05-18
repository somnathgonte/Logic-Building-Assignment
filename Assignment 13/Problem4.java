// 4. Accept number of rows and number of columns from user and display below pattern.

// Input : iRow = 3 iCol = 4
// Output : * # * #
//          * # * #
//          * # * #

import java.util.*;
public class Problem4 
{
    public static void display(int row, int col)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                if(j%2!=0)
                {
                    System.out.print("*  ");
                }
                else 
                {
                    System.out.print("# ");
                }
                
            }
            System.out.println();
        }
    }

    
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int iRow = sc.nextInt();

        System.out.println("Enter Column number : ");
        int iCol = sc.nextInt();

        display(iRow,iCol);
    }
    
}
