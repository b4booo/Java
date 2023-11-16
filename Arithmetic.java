import java.util.Scanner;

public class Practice
	{
		public static void main(String args[])
			{
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Enter first number: ");
				double num1 = scan.nextDouble();
				System.out.print("Enter second number: ");
				double num2 = scan.nextDouble();
				
				double sum = num1 + num2;
				double difference = num1 - num2;
				double product = num1 * num2;
				double quotient = num1 / num2;
				double modulo = num1 % num2;
				
				System.out.println("Sum: " + sum);
				System.out.println("Difference: " + difference);
				System.out.println("Product: " + product);
				System.out.println("Quotient: " + quotient);
				System.out.println("Modulo: " + modulo);
			}
	}