import java.util.Scanner;
class ArmyEligibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if (age >=18 )
		{
			System.out.print("Enter your Height in (cm):");
			float height = sc.nextFloat();
			if (height >= 162)
			{
				System.out.print("Enter your Weight :");
				float weight = sc.nextFloat();
				if (weight > 56)
				{
					System.out.print("Congratulations...You are Eligibile to join the Army!!!");
				}
				else 
				{
					System.out.print("Your weight is not fit in this criteria.. Please gain your weight and come again..");
				}
			}
			else 
			{
				System.out.print("Your height is not fit in the criteria so you are not Eligibile to join the Army...");
			}
		}
		else 
		{
			System.out.print("You are under age so you are not Eligibile to join the Army...");
		}
	}
}