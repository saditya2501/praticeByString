package practiceByString;
import java.util.Scanner;

public class practice10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("char ch = ");

        String ch = sc.next();
        System.out.printf("String str1 = ");

        String str1 = sc.next();
        System.out.println(str1.indexOf(ch));

    }

}