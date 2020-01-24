package com.company;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        int rollDice1, rollDice2;
        String keepPlaying = "";

        System.out.println("Welcome! Let's Play Roll Dice!");

        while (!keepPlaying.equalsIgnoreCase("no")){
            rollDice1 = random.nextInt((6 - 1) + 1) + 1;//random with 1-6 range
            rollDice2 = random.nextInt((6 - 1) + 1) + 1;
            System.out.println(rollDice1 + " and " + rollDice2);
            if (rollDice1 == 1 || rollDice2 == 1) { // add 0 if either of the rolls are 1
                total += 0;
                System.out.println("Score: " + total);
                System.out.println("Roll again? ");
                keepPlaying = scan.nextLine();
            } else if(rollDice1 == 1 && rollDice2 == 1){//add 25 total if both rolls are 1
                total += 25;
            }else if(total >= 100){//end loop
                System.out.println("Congrats! You won!");
                break;
            } else{ //add dice rolls to total
                total += (rollDice1+rollDice2);
                System.out.println("Score: " + total);
                System.out.println("Roll again? ");
                keepPlaying = scan.nextLine();
            }
        }
        System.out.println("Thanks for playing");
    }
}