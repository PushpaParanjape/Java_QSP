import java.util.Scanner;
class PositiveNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();

		if (num > 0)
		{
			System.out.print("The number is Positive");
		} 
		else if(num < 0)
		{
			System.out.print("The number is Negative");
		}
		else
		{
			System.out.print("You entered Zero");	
		}
	}
}
