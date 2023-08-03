//Accept numbers of rows and columns from user and display the below pattern

/*
   Input : iRow = 4          iCol = 5
   Output : 
            1  3  5  7  9
            2  4  6  8  10
            1  3  5  7  9
            2  4  6  8  10
*/

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
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
                if (i % 2 == 0) 
                {
                    System.out.print((2 * j) + "  ");
                } else 
                {
                    System.out.print((2 * j - 1) + "  ");
                }
            }
            System.out.println();
        }
    }
}
