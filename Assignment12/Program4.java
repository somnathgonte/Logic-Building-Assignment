// 4. Accept number from user and display below pattern. 
// Input :  	4 
// Output : 	# 	1 	* 	# 	2 	* 	# 	3 	* 	# 	4 	* 

import java.util.*;
public class Program4
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
            System.out.print('#'+" "+i+" "+'*'+" ");
        }
    }
}
    

