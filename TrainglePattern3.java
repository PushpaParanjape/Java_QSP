class TrainglePattern3
{
	public static void main(String[] args) {
		
		// for(int i = 1; i <= 5; i++)
		// {
		// 	int num = 1;
		// 	for (int j = 1; j <= i; j++)
		// 	{
		// 		System.out.print(num++ +" ");
		// 	}
		// 	System.out.println();
		// }


		//OR

		// for(int i = 1; i <= 5; i++)
		// {
		// 	for (int j = 1; j <= i; j++)
		// 	{
		// 		System.out.print(j+" ");
		// 	}
		// 	System.out.println();
		// }


		//2nd

		// int num = 1;
		// for(int i = 1; i <= 5; i++)
		// {
			
		// 	for (int j = 1; j <= i; j++)
		// 	{
		// 		System.out.print(num +" ");
		// 		num += 1;
		// 	}
			
		// 	System.out.println();
		// }



		//3rd

		// int num = 1;
		// for(int i = 1; i <= 5; i++)
		// {
			
		// 	for (int j = 1; j <= i; j++)
		// 	{
		// 		System.out.print(num +" ");
		// 		num += 2;
		// 	}
			
		// 	System.out.println();
		// }

		// 4th

		// char ch = 'a';
		// for(int i = 1; i <= 5; i++)
		// {
			
		// 	for (int j = 1; j <= i; j++)
		// 	{
		// 		System.out.print(ch +" ");
		// 		ch ++;
		// 	}
			
		// 	System.out.println();
		// }

		//5th
		int num = 1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				
				System.out.print(num++ +" ");
				
				
			}
			System.out.println();
			
		}
	}
}