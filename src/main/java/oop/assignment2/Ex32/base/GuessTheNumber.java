package oop.assignment2.Ex32.base;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String str[]){
        int numPalyers=0;
        int number=0;
        int guessNumber=0;
        Random randomGenerator = new Random();
        Scanner sca=new Scanner(System.in);
        System.out.println("how many games they would like to play: ");
        numPalyers=sca.nextInt();
        System.out.println("Would you like the games to be easy, normal, or hard:");
        String level=sca.next();
        int []count=new int[numPalyers];
        for(int i=1;i<=numPalyers;i++){
            count[i-1]=0;
            if(level.equals("easy")){
                System.out.println("Guess a number between 1-5: ");
                number = randomGenerator.nextInt(5)+1;
            }else if(level.equals("normal")){
                System.out.println("Guess a number between 1-10: ");
                number = randomGenerator.nextInt(10)+1;
            }else if(level.equals("hard")){
                System.out.println("Guess a number between 1-100: ");
                number = randomGenerator.nextInt(100)+1;
            }

            guessNumber=sca.nextInt();
            count[i-1]++;
            while(guessNumber!=number){
                if(guessNumber>number){
                    System.out.println("To high. Guess again: ");
                }else{
                    System.out.println("To low. Guess again: ");
                }
                guessNumber=sca.nextInt();
                count[i-1]++;
            }
            System.out.println("Correct!");
        }
        int totalcount=0;
        for(int i=0;i<numPalyers;i++){
            totalcount+=count[i];
        }
        System.out.println("It took you "+totalcount+" guess to win "+numPalyers+" games, Congratulations!");
        System.out.println("It took you an average of "+(1.0*totalcount/numPalyers)+" guesses per game!");
    }
}

