import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner 
		(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Your name is " + name);
		System.out.println("How many hours did you work last week?");
		double hoursWorked = input.nextDouble();
		System.out.println("You worked " + hoursWorked + " hours");
		System.out.println("What is your hourly pay rate?");
		double hourlyRate = input.nextDouble();
		System.out.println("Your hourly payrate is " + hourlyRate + " dollars");
		double weeklyGrossIncome = hourlyRate * hoursWorked;
		System.out.println("Hello " + name + ", your weekly gross income is $" + weeklyGrossIncome);
		input.close();
	 }
}
