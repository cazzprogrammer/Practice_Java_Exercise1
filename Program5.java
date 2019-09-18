import java.util.Scanner;
public class Program5
{
    public static void main(String args[]) {

      int sum = 0;
      Scanner sc =  new Scanner(System.in);
      String s = sc.nextLine();
      //System.out.println(s);
      //int sum = 0;
      String str[] = s.split(" ");
      for(int i=0;i<str.length; i++)
      {
        if(number(str[i]) ){
            sum += Integer.parseInt(str[i]);
        }
        else{
            System.out.println("Not an Integer: " + str[i] );
        }
      }  
     /*while(sc.hasNext())
      {
          String k = sc.next();
          System.out.println(k);
      }*/
      sc.close();

        System.out.println(sum);
    }

    public static boolean number(String s) {
        int flag = 0;
        for(int i=0;i< s.length();i++){
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!='-')
            {
                flag=1;
                break;
            }
        }
        if(flag == 1)
         return false;
        else
        return true; 
    }
}
