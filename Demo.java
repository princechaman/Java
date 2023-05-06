import java.util.Scanner;
class  Swapp
{
    public static void main (String arr[])
	{
		int a,b;
        Scanner in = new Scanner(System.in);	
	    System.out.print("Enter first number  :");
        a = in.nextInt();
		
		System.out.print("Enter second number  :");
        b = in.nextInt();

        System.out.print("Before Swapping ");
        System.out.print("a ="+a+" b ="+b);
        
		a= a+b;
		b=a-b;
		a=a-b;
        System.out.print("After Swapping ");
        System.out.print("a ="+a+" b ="+b);
	}
} 
    

