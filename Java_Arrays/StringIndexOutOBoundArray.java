class StringIndexOutOBoundArray
{
	static String str = "Ramesh";

	public static void main(String[] args) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			System.out.print(userCharAt(i)+" ");
		}
	}

	public static char userCharAt(int index)
	{
		if (index < 0 || index >= str.length()) 
		{
			throw new StringIndexOutOfBoundsException("You entered wrong Index");
		}

		char [] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) 
		{
			arr[i] = str.charAt(i);
		}

		return arr[index];
	}
}