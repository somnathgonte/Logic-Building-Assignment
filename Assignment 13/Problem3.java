// 3. Accept number of rows and number of columns from user and display below pattern.  

// Input : iRow = 3 iCol = 5
// Output : 5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1

import java.util.*;
public class Problem3 
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
            for(int j=5; j>=1; j--)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
