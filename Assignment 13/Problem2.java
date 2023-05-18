// 2. Accept number of rows and number of columns from user and display below pattern.

// Input : iRow = 4 iCol = 3
// Output : 1 2 3
//          1 2 3
//          1 2 3
//          1 2 3

import java.util.*;
public class Problem2 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row number :");
        int iRow = sc.nextInt();

        System.out.println("Enter column number :");
        int iCol = sc.nextInt();

        for(int i=1; i<=iRow; i++)
        {
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }

    }
    
}
