// 3. Accept number of rows and number of columns from user and display below pattern. 
// Input :  iRow = 3  	iCol = 5 	 
// Output : 5 	4 	3 	2 	1 
//  	 	5 	4 	3 	2 	1 
//  	 	5 	4 	3 	2 	1 


import java.util.*;
public class Problem3
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        printPattern(iRow,iCol);
    }

    public static void printPattern(int row,int col)
    {
        for(int i=1; i<=row;i++)
        {
            for(int j=col; j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

