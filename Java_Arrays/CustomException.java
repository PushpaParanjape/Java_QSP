import java.util.*;
class CustomException
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String kartikGF = "";
		String kartkWife = "Smita";

		if(kartikGF.isEmpty())
		{
			try
			{
				throw new KartikGFException("Kartik does not have any girlfriend");

			}
			catch(Exception e)
			{
				e.printStackTrace();

				if(kartkWife.isEmpty())
				{
					System.out.println("Kartik does not have wife");
				}
				else 
				{
					System.out.println("wife name is :"+kartkWife);
				}
			}
		}
		
	}
}

class KartikGFException extends Exception
{
	String message;
	KartikGFException(String message)
	{
		super(message);
	}

}