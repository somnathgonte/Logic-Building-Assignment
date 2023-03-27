// 5. Accept number from user and display below pattern. 
// Input :  	8 
// Output : 	2 	4 	6 	8 	10 	12 	14 	16 


import java.util.*;
public class Program5 
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
        for(int i =1; i<=num;i++)
        {
            System.out.print(2*i+" ");
        }
    }
}


    

