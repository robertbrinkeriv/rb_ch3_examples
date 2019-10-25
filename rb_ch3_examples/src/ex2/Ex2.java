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
