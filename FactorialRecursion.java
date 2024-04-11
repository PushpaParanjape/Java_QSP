import java.util.*;
class FactorialRecursion
{
	static int number;
	static int fact = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = sc.nextInt(); 
		
		fact();
		System.out.println(fact);

	}

	public static void fact()
	{
		fact = fact * number;
		number -- ;
		
		if(number == 0)
		{
			return;
		}
		fact();

	}
}