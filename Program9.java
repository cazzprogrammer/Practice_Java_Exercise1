import java.util.Scanner;
public class Program9
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.next();

        for(int i = s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        sc.close();

    }
}

