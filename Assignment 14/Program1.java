//Accept number of rows and numbers of columns from user and display below pattern.

/*
 Input : iRow = 4      iCol = 4

 Output :  A   B   C   D    
           A   B   C   D   
           A   B   C   D 
           A   B   C   D  
*/

import java.util.Scanner;

public class Program1 
{
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        

        for(int i=1; i<=iRow; i++)
        {
            char ch = 'A';
            for(int j=1; j<=iCol; j++)
            {
                System.out.print(ch+" ");
                ch++;   
            }
            System.out.println();
        }
    }    
}
