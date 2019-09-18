import java.util.*;

public class Menu
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char c;

        while(true)
        {
            System.out.println("........................................................................");
            System.out.println("press 1 to check whether it is palindrome or not.");
            System.out.println("press 2 to check whether the number is odd");
            System.out.println("press 3 to list all the vowels and consonant");
            System.out.println("press 4 to print a number pattern");
            System.out.println("press 5 to add list unspecified number of integers");
            System.out.println("press 6to check the input character is in Uppercase or Lowercase, is a digit or special character  ");
            System.out.println("press 7 to sort the digits of a number in desending order and print the sum of even digits");
            System.out.println("press 8 to play a game of guessing the number");
            System.out.println("press 9 reverse a string");
            System.out.println("press @ to substring the last nth letters of word and concatenate it nth times to the word");
            System.out.println("press 0 to exit ");
            System.out.println("........................................................................");
            //if(sc.hasNextInt())
            //{
                c = sc.next().charAt(0);
            //}

            switch(c)
            {
                case '0':
                    System.exit(0);
                    break;
                 case '1':
                    Program1.main(null);
                    break;   
                case '2':
                    Program2.main(null);
                    break;
                case '3':
                    Program3.main(null);
                    break; 
                case '4':
                    Program4.main(null);
                    break;
                case '5':
                    Program5.main(null);
                    break;
                case '6':
                    Program6.main(null);
                    break;
                case '7':
                    Program7.main(null);
                    break;          
                case '8':
                    Program8.main(null);
                    break;
                case '9':
                    Program1.main(null);
                    break; 
                case '@':
                    Program10.main(null);
                    break;
                default:
                    System.out.println("wrong input");              
                    break;
                }
        }

      
    }
}