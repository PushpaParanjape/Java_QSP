class FibonacciRecursive
{
	static int num1 = 0;
	static int num2 = 1;
	static int i = 1;
	static int fibo = 0;
	public static void main(String[] args) {
		
		System.out.println(num1 + "\n" + num2);
		fibb();
	
	}
	public static void fibb()
		{

				fibo = num1+num2;
				System.out.println(fibo);
				num1 = num2;
				num2 = fibo;
				i++;


			if (i <= 10)
			  {
			  	fibb();
			  }
			  else {
			  	return;
			  }
			
			
		}
}

		