import java.util.*;

public class Sumofnum {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of N : ");
	int n = scan.nextInt();
	int a1 = n+1;
	int a2 = n*a1;
	int sum = a2/2;
	System.out.println("Sum of first N natural numbers : " + sum);
	
	}
}