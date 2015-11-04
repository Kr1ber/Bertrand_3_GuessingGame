/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bertrand_3_strings;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kriber
 */
public class Bertrand_3_GuessingGame {

    /**
     * @param args the command line arguments
     */
    static int magicnumber;
    static int userguess;
    static String username;
    
    static Random randy = new Random();
    static boolean playagain;
    static int guessesleft=5;
    static int counter ;

    public static void main(String[] args) {
/*        
        magicnumber = randy.nextInt(100);

        System.out.println("Hello, would you like to play a game?");
        System.out.println("What's your name?");
        Scanner userinputname = new Scanner(System.in);
       
        username = userinputname.nextLine();
        System.out.println("Hello " + username + ", Guess a number");
        Scanner userinputnumbers = new Scanner(System.in);
        if (userguess == magicnumber) {;
        }
        int Something = sc.nextInt();
*/
         playagain = true;
         counter =5;
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         System.out.print("What is your name?\n>>");
         String name = sc.nextLine();
         System.out.print("Guess a number between 0 and 100, "+name+"\n>>");
         int guess = sc.nextInt();
         int randomNum = rand.nextInt(101);
         if(guess == randomNum) {
         System.out.println("You got it right");
         }else {
         System.out.println("Wrong! You guessed "+guess+" and the number was "+randomNum+".");
         
        while (counter > 0){ 
            
            playthegame();
            counter--;
            //guessesleft--;
        }

    }
    }
    
    static void playthegame() {
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
        Scanner userinputnumbers = new Scanner(System.in);
         System.out.print("Guess a number between 0 and 100, ");
         int guess = sc.nextInt();
         int randomNum = rand.nextInt(101);
         if(guess == randomNum) {
         System.out.println("You got it right");
         }else {
         System.out.println("Wrong! You guessed "+guess+" and the number was "+randomNum+".");



        }
    }
}
