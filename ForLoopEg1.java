class ForLoopEg1
{
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(i +" ");
		}

		System.out.println("\n****************************************************************");

		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.print(ch + " ");
		}

		System.out.println("\n****************************************************************");

		for (char ch = 'Z'; ch >= 'A'; ch--)
		{
			System.out.print(ch + " ");
		}

		System.out.println("\n****************************************************************");

		for (char ch = 97; ch <= 122; ch++)
		{
			System.out.print(ch +" ");
		}

		System.out.println("\n****************************************************************");

		for (char ch = 48; ch <= '9'; ch++)
		{
			System.out.print(ch + " ");
		}

		System.out.println("\n****************************************************************");

		for (int i = 100; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
	}
}