import java.util.Scanner;
class DrivingLic
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if (age >=18 )
		{
			System.out.print("Hove you given the RTO test? (yes/no) :");
			String test = sc.next().toUpperCase();
			if (test.equals("YES"))
			{
				System.out.print("Enter your marks :");
				double marks = sc.nextDouble();
				if (marks > 60)
				{
					System.out.print("Congratulations.. You eligible for Driving Licences!!!");
				}
				else 
				{
					System.out.print("You got "+marks+ " Please reapply for the test.");
				}

			}
			else 
			{
				System.out.print("Please first give the RTO test.");

			}


		}
		else 
		{
			System.out.println("You are a Small kid.. you will try after " + (18-age)+ " year/years");
		}
	}
}