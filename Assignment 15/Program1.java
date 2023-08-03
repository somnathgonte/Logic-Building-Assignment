//Accept numbers of rows and columns from user and display the below pattern

/*
   Input : iRow = 4          iCol = 4
   Output : 1  2  3  4
            5  6  7  8
            9  1  2  3
            4  5  6  7
*/

import java.util.*;

public class Program1 {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers of rows and columns : ");
        int iRow = obj.nextInt();
        int iCol = obj.nextInt();
        int count = 1;

        for (int i = 1; i <= iRow; i++) {
            for (int j = 1; j <= iCol; j++) {
                System.out.print(count + "  ");
                count++;
                if (count > 9) {
                    count = 1;
                }
            }
            System.out.println();
        }

    }
}