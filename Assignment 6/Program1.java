//Write a program which accept number from user and display its digits in reverse order.

/*
  Input : 2395
 Output : 9
          5
          3
          2
          
 Input : -1085
 Output : 5
          8
          0
          1
*/
import java.util.*;
public class Program1
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sc.nextInt();

        Program1 p1 = new Program1();    

        p1.display(iNo);
    }

    public void display(int no)
    {
        if(no < 0)
        {
            no = -no;
        }
        while(no != 0)
        {
            int rem = no % 10;
            System.out.println(rem);
            no /= 10;
        }
    }
}