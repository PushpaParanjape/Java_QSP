import java.util.Scanner;
class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name :");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hello my name is " +name+ " and my first letter is :" + ch);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("First letter " + ch + " is Vowel");
		}
		else{
			System.out.println("First letter " + ch + " is Consonent");
		}
	}
}