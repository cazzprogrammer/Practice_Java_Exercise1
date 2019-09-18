import java.util.*;
public class Program7
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();

        int sum = 0;
        int m = n;
        int count=0,rem=0;
        while(m>0)
        {
            rem = m%10;
            if(rem%2 == 0)
             sum = sum+rem;
            m=m/10;
            count++;
        }
        char c[] = new char[count];int i=0; int r=0;
    
       while(n>0)
        {
            r = n%10;
            c[i++] = (char)('0'+r);
            n=n/10;
        }
        Arrays.sort(c);
      
        System.out.print("Sorted number in non-increasing order : ");
        for(int l =count-1;l>=0;l--)
        {
            System.out.print(c[l]);
        }
        System.out.println();
        System.out.println("Sum of even number : " + sum);

        if(sum>15)
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();

    }
}
