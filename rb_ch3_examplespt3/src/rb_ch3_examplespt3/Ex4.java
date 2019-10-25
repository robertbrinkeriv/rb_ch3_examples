//HEADER
//Chapter 3 Exercise 4
//Robert Brinker IV
//CS160 Fall 2019
//10/24/2019
//Write a program that allows a user to input a random number, at or between 1 and 100, and have the computer tell the user if they guessed 
//the right number. If they do not guess the right number, they will be told the amount between their guess number and the correct one.

package rb_ch3_examplespt3;

import java.util.Random;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Random random = new Random();
        int number = random.nextInt(100) + 1;
		int guess;
        Scanner in = new Scanner(System.in);
        System.out.print("I'm thinking of a number at, or between the numbers 1 and 100, \nType your guess: ");
                 guess = in.nextInt();
                 System.out.printf("%d Is the correct number", number);
                 if (guess == number) System.out.print("You are correct!");
                 if (guess != number) System.out.print("\nYou were off by: ");
                 if (guess > number) System.out.print(guess-number);
                 if (guess < number) System.out.print(number-guess);
                 
                 in.close();
                 
	}
	
}
