import java.util.Scanner;
public class ComputeFutureValue {
	public static void main(String[] args) {
		Scanner input = new Scanner 
		(System.in);
		System.out.println("Enter the investment amount");
		Double InvestmentAmount = input.nextDouble();
		System.out.println("Enter the annual interest rate in %");
		Double annualInterestRate = input.nextDouble();
		System.out.println("Enter the number of years");
		int numberOfYears = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double futureInvestmentValue = InvestmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		System.out.println("The future investment value is " + Math.round(futureInvestmentValue * 100.0) / 100.0);

		input.close();
	 }
}
