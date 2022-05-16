package Project4;
import java.util.Scanner;
public class DragonsCaveJunit {

    public static void main(String[] args) {
        char answer = 'N';Scanner scanner = new Scanner(System.in);
        while (answer == 'N') {
          /*  Scanner scanner = new Scanner(System.in);
            System.out.println("What cave will you enter 1 or 2");
            int num = scanner.nextInt();
            while (num != 1 && num != 2) {
                System.out.println("Enter 1 or 2");
                 num = scanner.nextInt();
            }*/
            DragonsCaveJunit d=new DragonsCaveJunit();
            int num=d.returnNum();
            System.out.println(d.getmenu(num));
         /*   if (num == 1) {
                System.out.println("Here is treasure");

            } else if (num == 2) {
                System.out.println("You are dead");
            } else {
                System.out.println("Enter a number");
                continue;
            }*/


            System.out.println("Play again Enter Y or N");
            char c = scanner.next().charAt(0);
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
    public int returnNum()
    {
        int num=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What cave will you enter 1 or 2");
       num = scanner.nextInt();
        while (num != 1 && num != 2) {
            System.out.println("Enter 1 or 2");
            num = scanner.nextInt();
        }
        return num;
    }
    public String getmenu(int num)
    {   String item="";
        if (num == 1) {
            item="Here is treasure";

        } else if (num == 2) {
            item="You are dead";
        } else {
            item="Enter a number";
            /*continue;*/
        }

        return item;
    }

        }



