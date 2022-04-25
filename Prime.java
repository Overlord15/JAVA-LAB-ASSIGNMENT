import java.util.Scanner;

class prime {
 public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number : ");
  int num = sc.nextInt();
  int num2 = num%2;
  if (num==1 || num==0)
   System.out.println("Not prime not composite");
  else{ 
   if (num2 == 0)
    System.out.println("Number is not prime");
   else
    System.out.println("Number is prime");}
}
}
  