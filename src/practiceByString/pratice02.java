package practiceByString;
import java.util.Scanner;

public class pratice02 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter String Value :        ");

        String stringInput = sc.nextLine();

        System.out.printf("Enter index for substring : ");

        int indexOfSubstring = sc.nextInt();

        String substring = stringInput.substring(indexOfSubstring);

        System.out.println("subString Value = "+substring);



    }

}
