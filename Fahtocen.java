import java.util.Scanner;

public class Fahtocen
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit : ");
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius : "+celsius);        
    }
}