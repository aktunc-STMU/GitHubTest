import java.util.Scanner;
public class FindAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner 
		(System.in);
		System.out.println("Please enter a number");
		int num1 = input.nextInt();
		System.out.println("Please enter another number");
		int num2 = input.nextInt();
		System.out.println("Please enter another number");
		int num3 = input.nextInt();
		double average = (num1 + num2 + num3) / 3.0;
		System.out.println("The average of " + num1 + " and " + num2 + " and " + num3 + " is " + average);
		
		input.close();
	 }
}
