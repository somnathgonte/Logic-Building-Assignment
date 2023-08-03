//Accept numbers of rows and columns from user and display the below pattern

/*
   Input : iRow = 5          iCol = 5
   Output : 
             1   2   3   4   5
            -1  -2  -3  -4  -5
             1   2   3   4   5
            -1  -2  -3  -4  -5
             1   2   3   4   5
*/


import java.util.Scanner;

public class Program4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int iRow = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int iCol = sc.nextInt();
        
        // Logic to print the pattern
        for (int i = 1; i <= iRow; i++) 
        {
            for (int j = 1; j <= iCol; j++) 
            {
                int num = 0;
                if (i % 2 == 0) 
                {
                    num = -j;
                } 
                else 
                {
                    num = j;
                }
                System.out.printf("%4d",num);
            }
            System.out.println();
        }
    }
}

