//Accept N numbers from user and find the defference between summation of even elements and odd elements.

/*
 Input : N = 6
        85  66  3  80  93  88
        
Output : 53 (234-181)
*/


import java.util.*;
public class Problem11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int size = sc.nextInt();               //take array size from user.

        int[] no = new int[size];            //creating array to store int data.

        int evenSum = 0;
        int oddSum = 0;
        int diff = 0;

        System.out.println("Enter Numbers:");

        for(int i=0; i<no.length; i++)
        {
            int a = sc.nextInt();           //take input numbers from user.

            no[i]=a;

            if(no[i]%2==0)
            {
                evenSum = evenSum+no[i];
            }
            else
            {
                oddSum = oddSum + no[i];           
            }
        }
        diff = evenSum-oddSum;
        System.out.println("The difference between summation of even and odd number is : "+diff);     
    }
}
