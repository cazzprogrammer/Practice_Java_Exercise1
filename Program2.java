import java.util.Scanner;
public class Program2
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's odd or even");
        int n  =  sc.nextInt();
        
        if(n>20 && n<30){

            if(n%2 == 0)
            {
                System.out.println("Tom");
            }
            else{
                System.out.println("Jerry");
            }
        }
        else{
            System.out.println("Out of range : Number Should be between 20 to 30");
        }
        sc.close();
    }
}

