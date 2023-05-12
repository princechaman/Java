import java.util.*;
class Arithmetic
{
     public static void main(String arr[]) 
	 {
	   int a,b,r;
	   Scanner in = new Scanner(System.in);
	   System.out.print("Enter a number :");
	   a = in.nextInt();
	   
	   System.out.print("Enter b number :");
	   b = in.nextInt();
	   
	   r =a+b;
	   System.out.println("Addition :"+r);

	   r =a-b;
	   System.out.println("Subtraction :"+r);

	   r =a*b;
	   System.out.println("Multiplication:"+r);
	   
	   r =a/b;
	   System.out.println("Division :"+r);
	   
	   
	   r =a%b;
	   System.out.println("Modulus:"+r);  
	   
	 }
}