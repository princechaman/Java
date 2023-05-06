public import java.util.Scanner;
class  Percentage
{
    public static void main (String arr[])
	{
		int a,b,c;
        Scanner in = new Scanner(System.in);	
	    System.out.print("Enter first number  :");
        a = in.nextInt();
		
		System.out.print("Enter second number  :");
        b = in.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.print("Before Swapping ");
        System.out.print("a ="+a+" b ="+b);
        System.out.print("After Swapping ");
        System.out.print("a ="+a+" b ="+b);
	}
} 
    

