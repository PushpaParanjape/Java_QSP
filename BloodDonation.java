import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if (age > 20)
		{
			System.out.print("Enter your weight :");
			float weight = sc.nextFloat();
			if (weight >= 50)
			{
				System.out.print("Have you consume Cigarette/Alcohol in last 24 hrs? (yes/no) :");
				String consume = sc.next().toLowerCase();
				if(consume.equals("yes"))
				{
					System.out.println("You are not eligible for blood donation..");
				}
				else{
					System.out.println("You are eligible for blood donation..");
				}

			}
			else 
			{
				System.out.println("You are not eligible for blood donation..");
			}	

		}
		else 
		{
			System.out.println("You are not eligible for blood donation try after " + (20 - age)+ " years/year");
		}
	}
}