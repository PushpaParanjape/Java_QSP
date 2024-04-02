import java.util.Scanner;
class EligibleMarrige
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		System.out.print("Enter your property :");
		double property = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter your Surname :");
		String surname = sc.next().toUpperCase();

		if((age >= 21 && property > 10000000) || (surname.equals("AMBANI")))
		{
			System.out.println("Yes.. You are eligible to marry");
		}
		else
		{
			System.out.println("No.. You are not eligible to marry");
		}
	}
}