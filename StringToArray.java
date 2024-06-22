import java.util.*;
class StringToArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence :");
		String sentence = sc.nextLine();

		String word = " ";

		for (int i = 0;i < sentence.length(); i++) 
		{
			char ch = sentence.charAt(i);
			if(ch == ' ')
			{
				System.out.println(i);
				break;
			}
			
			word += ch;
		}
		System.out.println(word);
	}

}