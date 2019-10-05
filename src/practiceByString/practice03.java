package practiceByString;
import java.util.Scanner;

public class practice03 {

    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            String st1 = sc.nextLine();

            st1 = st1.toLowerCase();

            st1 = st1.replace('a','*');
            st1 = st1.replace('e','*');
            st1 = st1.replace('i','*');
            st1 = st1.replace('o','*');
           st1 = st1.replace('u','*');

            System.out.println(st1);

        }

    }
