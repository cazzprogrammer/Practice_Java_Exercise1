import java.util.Scanner;
public class Program10
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.next();

        System.out.println("Enter a number based on which the last n character will be repeated");
        int n = sc.nextInt();

        String d = s.substring(s.length()-n);
        System.out.print(s);
        for(int i=0;i<n;i++){
            System.out.print(d);
        }
        System.out.println();
        sc.close();

    }
}

