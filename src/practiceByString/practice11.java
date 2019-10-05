package practiceByString;
import java.util.Scanner;
public class practice11 {

        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);

            System.out.printf("char ch = ");

            String ch = sc.next();

            System.out.printf("String str1 = ");

            String str1 = sc.next();



            for (int i = 0; i <str1.length() ; i++){

                if (str1.charAt(i) == ch.charAt(0)){

                    System.out.println(i);

                }

            }

        }

    }
