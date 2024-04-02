import java.util.Scanner;
class PassFail
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage :");
		float percentage = sc.nextFloat();

		if(percentage < 35)
		{
			System.out.println("You are failed:");
		}
		else if(percentage <= 60)
		{
			System.out.println("Second class with B Grade");
		}
		
		else if (percentage <= 75)
		{
			System.out.println(" First Class with A Grade");
		}
		else if (percentage <= 90)
		{
			System.out.println("Distinction with A+ Grade");
		}
		else if (percentage <= 100)
		{
			System.out.println("Congratulations.. You pass with first class with Distinction with O grade");
		}
		else
		{
			System.out.println("Input is Invalid");
		}
	}
}
