//Accept numbers of rows and columns from user and display the below pattern

/*
   Input : iRow = 4          iCol = 4
   Output : 
             1   2   3   4   
             2   3   4   5
             3   4   5   6
             4   5   6   7
*/


import java.util.Scanner;

public class Program5
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
            int num = i;
            for (int j = 1; j <= iCol; j++) 
            {
                System.out.printf("%4d", num);
                num++;
            }
            System.out.println();
        }
    }
}

