// 1. Accept number from user and display below pattern. 
// Input :  	5 	 
// Output : 	A 	B 	C 	D 	E 

import java.util.*;
public class Program1
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
        char ch = 'A';
        num = num+'A';
        for(char i ='A';i < num;i++)
        {
            System.out.print(i+" ");
        }
    }
}
