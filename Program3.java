import java.util.Scanner;
public class Program3
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.next();

        int l = s.length();
        //int flag = 0;
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if((c >= 'A' && c <= 'Z') || (c>='a' && c<='z'))
            {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'i' || c == 'U' || c == 'O')
                {
                    System.out.print(c+"-Vowel,");
                }
                else{
                    System.out.print(c+"-Consonant,");
                }

            }
            else{
                System.out.print(c+" Not an alphabet");
                break;
            }
       }
       sc.close();
  }
}
