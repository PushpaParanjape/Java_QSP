class MethodEg
{
	public static void main(String[] args) {
		
		System.out.println("Execution starts");
			checkEvenOdd(73);

		System.out.println("Execution ends");
	}

	public static void checkEvenOdd(int num)
	{
		if (num % 2 == 0)
		{
			System.out.println(num + " is Even Number");
		}
		else
		{
			System.out.println(num + "is odd number");
		}
	}
}