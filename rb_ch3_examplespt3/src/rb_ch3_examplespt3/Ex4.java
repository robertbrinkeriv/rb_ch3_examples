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
