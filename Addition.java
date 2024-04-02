//How to use a scanner class
import java.util.Scanner;
class Addition
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number :");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number :");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		System.out.print("Addition is :"+add);
	}

}