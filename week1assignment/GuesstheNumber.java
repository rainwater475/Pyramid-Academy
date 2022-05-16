package week1assignment;
import java.util.Random;
import java.lang.*;
import java.util.Scanner;


public class GuesstheNumber {

    public static void main(String[] args)
    {
        double doubleRandomNumber = Math.random() * 20;
        System.out.println("doubleRandomNumber = " + doubleRandomNumber);
        // cast the double to whole number
        int randomNumber = (int)doubleRandomNumber;
        System.out.println(randomNumber);

       // System.out.println(number);
        Scanner myObj = new Scanner(System.in);
        int counter=0;
        boolean quit=false;
        String userName="";
        while (quit==false) {
            System.out.println("Hello, What  is your name?");
             userName = myObj.nextLine();
            System.out.println("Username is: " + userName+ "I am thinking of a number between 1 and 20");
            System.out.println("Take a guess");
            int guess = myObj.nextInt();
            char c=' ';
            counter++;
            while (counter<6)
            {
                if(guess==randomNumber)
                { System.out.println("Good job "+userName+" You guessed my number in "+ counter +" guesses");
                    break;
                }
                else if (guess<randomNumber)
                {
                    System.out.println("Your guess is too low");
                    System.out.println("Take a guess");
                    guess = myObj.nextInt();
                }
                else if (guess>randomNumber)
                {
                    System.out.println("Your guess is too high");
                    System.out.println("Take a guess");
                    guess = myObj.nextInt();
                }
                counter++;
            }

            if (counter ==6)
            {
                System.out.println("Did not guess");
                System.out.println("Would you like to play again Y or N");
                c = myObj.next().charAt(0);
                if (c=='Y')
                {
                     myObj = new Scanner(System.in);
                    userName="";
                    counter=0;
                    ;
                }
                else if (c=='N')
                {
                    quit=true;
                }

            }
            else{
                System.out.println("Would you like to play again Y or N");
                c = myObj.next().charAt(0);
                if (c=='Y')
                { myObj = new Scanner(System.in);

                    userName="";
                    counter=0;
                    ;
                }
                else if (c=='N')
                {
                    quit=true;
                }
            }

        }

    }
}
