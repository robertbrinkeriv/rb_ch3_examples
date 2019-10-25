//HEADER
//Chapter 3 Exercise 2
//Robert Brinker IV
//CS160 Fall 2019
//10/24/2019
//Write a program using my new knowledge of doubles and the scanner class, which allows the user to convert celsius to fahrenheit. 
//Allow a user input, and output the result in the console.

package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		double Celsius;
        int Fahrenheit;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Enter the Temperature in Celsius: ");
        Celsius = in.nextDouble();

        // convert and output the result
        Fahrenheit = (int) ((Celsius * 9/5) + 32);
        
        
        System.out.printf("%.2f C = %d F\n",
                          Celsius, Fahrenheit);
        in.close();
                          
        

       

	}

}
