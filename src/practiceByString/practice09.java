package practiceByString;
import java.util.Scanner;

public class practice09 {
    
        public static void main(String[] artgs) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter String Value : ");
            String str1 = sc.nextLine();

           int LWeight = 0, UWeight = 0 ,abWeight =0;

            for (int i = 0; i <str1.length() ; i++) {

                if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'){
                    UWeight += (int) str1.charAt(i);

                }

                else if (str1.charAt(i) >= 'a' || str1.charAt(i) <= 'z'){

                    LWeight += (int) str1.charAt(i);

                }

            }

            abWeight = UWeight - LWeight;

            if (abWeight < 0)

                System.out.println("absoluteWeight = " + abWeight*(-1));

            else
                System.out.println("absoluteWeight = " + abWeight);

        }

    }
