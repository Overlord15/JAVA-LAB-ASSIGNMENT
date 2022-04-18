import java.util.Scanner;

public class Addtwonum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		float num1 = scan.nextFloat();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter second number : ");
		float num2 = scan.nextFloat();
		float sum = num1 + num2;
		System.out.println("The sum of two numbers are : " +sum);
	}
}