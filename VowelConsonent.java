import java.util.Scanner;
class VowelConsonent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Alphabet to check whether it is Vowel or Consonent :");
		char alphabet = sc.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'A')
		{
			System.out.println(alphabet + " Is the Vowel");
		}
		else if (alphabet == 'e' || alphabet == 'E')
		{
			System.out.println(alphabet + " Is the Vowel");
		}
		else if (alphabet == 'i' || alphabet == 'I')
		{
			System.out.println(alphabet + " Is the Vowel");
		}
		else if (alphabet == 'o' || alphabet == 'O')
		{
			System.out.println(alphabet + " Is the Vowel");
		}
		else if (alphabet == 'u' || alphabet == 'U')
		{
				System.out.println(alphabet + " Is the Vowel");
		}
		else 
		{
			System.out.println(alphabet + " Is the Consonent");
		}
	}
}