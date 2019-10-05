package practiceByString;
import java.util.Scanner;

public class practice08 {
        public static void main(String[] artgs) {
            Scanner sc= new Scanner(System.in);

            System.out.printf("Enter String Value : ");
            String str1 = sc.nextLine();



            int upperCasrWeight = 0;

            for (int i = 0; i < str1.length(); i++) {

                if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'){

                    upperCasrWeight+= (int) str1.charAt(i);

                }

            }



            System.out.println("UpperCaseWeight of input String :" + upperCasrWeight);

            sc.close();

        }

    }
