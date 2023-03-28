// 1. Accept number of rows and number of columns from user and display below pattern. 
// Input :  	iRow = 4  	iCol = 3 	 
// Output : 	* 	* 	* 	
//  	 	    * 	* 	* 	
//  	 	    * 	* 	* 	
//  	    	* 	* 	* 	

import java.util.*;
public class Problem1
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
            for(int j=1; j<=col;j++)
            {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}