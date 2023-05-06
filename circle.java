import java.util.Scanner;
class Circle 
{
    public static void main (String arr[])
	{
		float pi=3.14f ,redius,area,perameter;
        Scanner ob = new Scanner(System.in);	
	    System.out.print("Enter a redius");
         
		redius= ob.nextFloat();
		area=pi*(redius*redius);
		perameter=2*pi*redius;
		System.out.println("area of circle ="+area);
		System.out.print("area of circle ="+perameter);
	}
}