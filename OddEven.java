import java.util.Scanner;
class OddEven
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();

		if (num % 2 == 0)
		{
			System.out.print("The number is Even");
		} 
		else
		{
			System.out.print("The number is Odd");
		}
	}
}
