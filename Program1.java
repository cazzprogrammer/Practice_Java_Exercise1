import java.util.Scanner;
public class Program1
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether its is palindrome or not");

        int n  = sc.nextInt();

        int m = n;
        int rem=0,w=0,even = 0;
        while(m>0)
        {
            rem = m%10;
            if(rem%2 == 0)
            {
                even= even+rem;
            }
            w = w*10+rem;
            m = m/10;
        }

        if(w==n)
        {   //System.out.println(even);
            if(even >= 25)
            {
                System.out.println(n+" is palindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(n+" is palindrome and the sum of even numbers is less than 25");
            }
        }
        else{
            System.out.println(n+" is not palindrome");
        }
        sc.close();
    }
}