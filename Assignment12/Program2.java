// 2. Accept number from user and display below pattern. 
// Input :  	5 	 
// Output : 	5 	# 	4 	# 	3 	# 	2 	# 	1 	# 

import java.util.*;
public class Program2
{
    public static void main(String []arg) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();
        displayPattern(iNo);
    }

    public static void displayPattern(int num)
    {
        for(int i=num; i>=1; i--)
        {
            System.out.print(i+" "+'#'+" ");
        }
    }
}


