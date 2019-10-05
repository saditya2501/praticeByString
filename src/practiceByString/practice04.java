package practiceByString;
import java.util.Scanner;

public class practice04 {

    public static void main(String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);

        String st1 = sc.next();



        st1 = st1.toLowerCase();

        for (int i = 0; i < st1.length(); i++) {

            if (st1.charAt(i) == 'a' || st1.charAt(i)=='e' || st1.charAt(i)=='o' || st1.charAt(i)=='u' || st1.charAt(i)=='i') {

                char replaceChar = st1.charAt(i);

                count += 1;

                switch (count) {

                    case 1:

                        st1 = st1.replace(replaceChar, '*');

                        break;

                    case 2:

                        st1 = st1.replace(replaceChar, '^');

                        break;

                    case 3:

                        st1 = st1.replace(replaceChar, '!');

                        break;

                    case 4:

                        st1 = st1.replace(replaceChar, '&');

                        break;

                    case 5:

                        st1 = st1.replace(replaceChar, '$');

                        break;

                    default:

                        st1 = st1.replace(replaceChar, '_');

                }

            }

        }

        System.out.println(st1);

        sc.close();

    }

}


