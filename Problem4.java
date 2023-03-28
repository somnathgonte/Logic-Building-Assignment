// 4. Accept number of rows and number of columns from user and display below pattern. 
// Input :  	iRow = 3  	iCol = 4 	 
// Output : 	* 	# 	* 	# 	 
//        	 	* 	# 	* 	# 	 
//  	    	* 	# 	* 	# 	 

import java.util.*;
public class Problem4
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
                if(j%2==0)
                {
                   System.out.print('#'+" ");
                }
                else 
                {
                    System.out.print('*'+" ");
                }
            }
            System.out.println(" ");
        }
    }
}


