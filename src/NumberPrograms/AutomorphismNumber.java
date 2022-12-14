/*
 * Automorphic number program:
 * A number is automorphic if and only if the square of the given input ends with
 * the same number input itself. 
 */

package NumberPrograms;
import java.util.*;

public class AutomorphismNumber {
	public static void main(String[] args) {
		//steps to follow:
		//get the input from user
		//find square of the i/p
		//filter out the last two digits and compare with the given i/p
		
		//declare variables
		int input, square, length=0;
		int lastDigit=0;
		
		//init the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input: ");
		input = scanner.nextInt();
		
		//get the length of input to compare with final o/p
		length = String.valueOf(input).length(); //success

		square = input*input;
		System.out.println("Square of "+input+" is: "+square);

		//determines the last digit of the variable square  
		lastDigit = (int) (square%(Math.pow(10, length)));   
		System.out.println(lastDigit);

		if(input==lastDigit)
			System.out.println("Automorphic number");
		else
			System.out.println("not Automorphic number");
		
	}
}
