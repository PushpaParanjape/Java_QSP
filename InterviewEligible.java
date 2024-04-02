import java.util.Scanner;
class InterviewEligible
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage :");
		float percentage = sc.nextFloat();
		if(percentage > 60)
		{
			System.out.println("Congratualations You are eligible for the Interview !!!");
		}
		else
		{
			System.out.println("Sorry.. You are not eligible for Interview..");
		}
	}
}
