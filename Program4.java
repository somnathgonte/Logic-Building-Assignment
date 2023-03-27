//Accept one number from user and print even factors of that number.
//Input : 24
//Output : 2 4 6 8 12 
import java.util.*;
public class Program4 
{
    public static void  displayFactor(int num)
    {
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0 && i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();
        displayFactor(iNo1);
    }
}
