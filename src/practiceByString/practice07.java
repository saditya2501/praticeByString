package practiceByString;
import java.util.Scanner;

public class practice07 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string =");
            String Input = sc.nextLine();
            int tweight = 0;
            int length = Input.length();
            System.out.printf("totalWeight = ");
            for (int i = 0; i < length; i++) {
                int weight = (int) Input.charAt(i);
                tweight = tweight + weight;
                System.out.print( weight + " + ");
            }
            System.out.print("\b\b \nTOTAL WEIGHT =" + tweight);
        }
}
