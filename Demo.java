import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
    {
        int num,i;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter a number :");
		num = in.nextInt();
		
		for(i=1;i<=10;i++){
		
			    System.out.println(num+ "*"+ i + "="+ num*i);
		}  
   }
}  