import java.util.Scanner;

class Palindrome{  
 public static void main(String[] args){  
  Scanner sc = new Scanner(System.in);
  int r,sum=0,temp;
  System.out.print("Enter the number : ");    
  int n = sc.nextInt();
  
  temp=n;    
  while(n>0){    
   r=n%10;
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("Palindrome number ");    
  else    
   System.out.println("Not palindrome");    
}  
}