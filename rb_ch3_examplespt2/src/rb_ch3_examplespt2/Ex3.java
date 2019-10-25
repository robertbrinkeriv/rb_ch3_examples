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
