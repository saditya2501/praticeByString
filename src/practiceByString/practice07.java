package practiceByString;
import java.util.Scanner;

public class practice07 {
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        String stringInput = sc.nextLine();

        int lenOfStr = stringInput.length();

        int totalWeight=0;

        System.out.printf("totalWeight = ");



        for (int i = 0; i < lenOfStr ; i++) {

            int weightOfChar = (int) stringInput.charAt(i);

            totalWeight = totalWeight + weightOfChar;

            System.out.print( weightOfChar + " + ");

        }

        System.out.println("\b\b \ntotalWeight = "+ totalWeight);



    }

}