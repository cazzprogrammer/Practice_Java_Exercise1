import java.util.Scanner;
public class Program6
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");

        char c = sc.next().charAt(0);

        if(c>='A' && c <= 'Z')
        {
         System.out.println("Capital Letter");
        }
        else if(c>='a' && c <= 'z')
        {
         System.out.println("Small Letter");
        }
        else if(c>='0' && c <= '9')
        {
         System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
        sc.close();

    }
}
