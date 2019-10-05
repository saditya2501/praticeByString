package practiceByString;
import java.util.Scanner;

public class practice05 {

            public static void main(String args[]){

            Scanner sc = new Scanner(System.in);



            System.out.printf("Enter  String Value : ");

            String stringInput = sc.nextLine();

            System.out.printf("Enter Value of subString : ");

            String subStringInput = sc.nextLine();

            System.out.printf("Enter the  Value to be Replaced with : ");

            String subStringInputForReplacement = sc.nextLine();



            String newString = stringInput.replace(subStringInput,subStringInputForReplacement);

            System.out.println("New String : " + newString);





        }

    }