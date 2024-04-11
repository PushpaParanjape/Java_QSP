import java.util.*;
class FactorsRecursion
{
	static int number;
	static int i = 1;
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = sc.nextInt();

		factor();
	}
	public static void factor()
	{
		if(number % i == 0)
		{
			System.out.println(i + " ");

		}
		if(i == number )
		{
			return;
		}
			i++;
		factor();
	}
}