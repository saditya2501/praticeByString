package practiceByString;
import java.util.Scanner;

public class practice {

           public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String stringInput = sc.nextLine();

            int len = stringInput.length();

            System.out.println(stringInput);

            System.out.print("index :");

            for (int i = 0; i < len ; i++) {

                System.out.printf("%4d",i);

            }

            System.out.print("\nchars :");

            for (int i = 0; i < len ; i++) {

                System.out.printf("%4s",stringInput.charAt(i));

            }
           }
}


