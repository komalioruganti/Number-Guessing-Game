package Code_GuessingGame;

import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO THE GUESSING GAME!!");
        int computernumber = (int) (Math.random() * (100 + 1));
        System.out.println("Enter a number between 0 and 100 : ");
        int user_num = in.nextInt();
        int count = 1;
        System.out.println(determineGuess(user_num,computernumber,count));
        while(user_num!=computernumber){
        count++;
            int b = in.nextInt();
            user_num=b;
            System.out.println(determineGuess(user_num,computernumber,count));
        }

    }
    static String determineGuess(int user_num,int computernum,int count){
        if(user_num<=0 || user_num>100){
            return "Your guess is invalid.\n Enter a number between 0 and 100" ;
        }
            if(user_num>computernum){

                return "Your guess is too high.\n Try again. " ;

            } else if (user_num<computernum) {

                return "Your guess is too low.\n Try again." ;

            }
        else{

           return "Correct! Your total guesses: " + count;

        }

    }
}