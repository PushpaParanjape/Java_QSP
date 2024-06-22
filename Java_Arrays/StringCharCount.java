/* String val from user
Enter the character to get the count

o/p :- The count of the character

Ex1 :- qspiderqspssp
Enter the character to get the count:
s

o/p --  4
*/

import java.util.*;
class StringCharCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String data = sc.nextLine().toLowerCase();

		System.out.println("Enter the character to get count");
		char ch = sc.next().charAt(0);

		int count = 0;

		for(int i = 0; i < data.length(); i++)
		{
			char ch2 = data.charAt(i);

			if(ch == ch2)
			{
				count++;
			}
		}
		System.out.println("Count of "+ch+" is :" + count);

	}
}