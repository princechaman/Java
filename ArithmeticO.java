improt java.util.*
class ArithmeticO
{
     public static viod main 
	 {
	   int a, b ,r;
	   Scanner in = new Sanner(System.in);
	   System.out.print("Enter a number :");
	   a = in.nextInt();
	   
	   System.out.print("Enter b number :");
	   b = in.nextInt();
	   
	   r =a+b;
	   r =a-b;
	   r =a*b;
	   r =a/b;
	   r =a%b;
	   
	   System.out.println("Addition :"+r);
	   System.out.println("Subtraction :"+r);
	   System.out.println("Multiplication:"+r);
	   System.out.println("Division :"+r);
	   System.out.println("Modulus:"+r);  
	   
	 }
}