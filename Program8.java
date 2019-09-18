import java.util.Scanner;
public class Program8
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int original = (int)(Math.random()*100) + 1;
        System.out.println(original);
        System.out.println("Enter a number between 1 to 100");
        int guess = 0;
       do{
            guess = sc.nextInt();
            if(guess>original)
            {
                System.out.println("Number guessed is more than original number");
            }
            else if(guess<original)
            {
                System.out.println("Number guessed is less than original number");
            }
            else
            {
                System.out.println("Number guessed matches the original number");
            }

        }while(guess != original);
        sc.close();

    }
}

    
