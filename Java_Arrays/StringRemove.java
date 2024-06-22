//input : playhomessss
//enter the character to remove occurances: s
//op : playhome
import java.util.*;
class StringRemove
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word :");
		String word = sc.next();
		
		System.out.print("Enter the character to remove occurances : ");
		String ch = sc.next();

		String replaced = word.replace(ch, " ");
		System.out.println(replaced);

		
	}
}
