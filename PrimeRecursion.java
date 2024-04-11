import java.util.*;
class PrimeRecursion
{
	static int num;
	static int i = 2;
	static boolean flag = true;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();

		prime();
		System.out.println(flag ? "Prime" : "Not a Prime");

	}

	public static void prime()
	{
		if (i == num)
		{
			return;
		}

		if (num % i == 0)
		{
			flag = false;
			return;
		}	
		i++;	
		prime();
	}
}