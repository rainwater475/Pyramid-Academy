package Project3;
import java.util.Scanner;
public class DragonsCaveExHandl {

    public static void main(String[] args) {
        char answer = 'N';
        int num=0;
        while (answer == 'N') {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What cave will you enter 1 or 2");
            try {
                 num = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("You must enter 1 or 2");
            }
            while (num != 1 && num != 2) {
                System.out.println("Enter 1 or 2");
                 num = scanner.nextInt();
            }
            if (num == 1) {
                System.out.println("Here is treasure");

            } else if (num == 2) {
                System.out.println("You are dead");
            } else {
                System.out.println("Enter a number");
                continue;
            }
            char c=' ';

            System.out.println("Play again Enter Y or N");
            try {
                c = scanner.next().charAt(0);
            }
            catch(Exception e)
            {
                System.out.println("You must enter Y or N");
            }
            while (c != 'Y' && c != 'N') {
                System.out.println("Enter Y or N");
                c = scanner.next().charAt(0);
            }


            if (c == 'Y') {
                answer = 'N';


            } else if (c == 'N') {

                answer = 'Y';

            }
        }

    }
        }



