//HEADER
//Chapter 3 Exercise 3
//Robert Brinker IV
//CS160 Fall 2019
//10/24/2019
//Write a program that allows the user to input a number of seconds and output them in total of hours, minutes, and seconds. 
//Use new knowledge of the modulus operator.

package rb_ch3_examplespt2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int second;
        int hours, minutes, seconds;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Enter total seconds: ");
        second = in.nextInt();

        // convert and output the result
        hours = (int) (second / 3600) ;
        minutes = (int) (second % 3600) / 60;
        seconds =  (int) (second % 60);
        System.out.printf("Total Seconds = %d hours, %d minutes, %d seconds\n",
                hours, minutes, seconds);
        in.close();

	}

}
