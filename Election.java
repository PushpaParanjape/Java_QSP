import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Age :");
		int age = sc.nextInt();
		if (age >=18)
		{
			System.out.print("Do you have a Voter ID (yes/no) :");
			String voterId = sc.next().toLowerCase();
			if (voterId.equals("yes"))
			{
				System.out.println("*********WELCOME*********");
				System.out.println("1. BJP");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. None of the above");

				System.out.println("Choose the option for vote for your favourite party");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP"))
				{
					System.out.println("You have voted for BJP");
				}
				else if(vote.equals("CONGRESS"))
				{
					System.out.println("You have voted for Congress");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println("You have voted for AAP");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println("You have voted for MNS");
				}
				else if(vote.equals("SHIVSENA"))
				{
					System.out.println("You have voted for Shiv Sena");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You have voted for NCP");
				}
				else if(vote.equals("NONE OF THE ABOVE"))
				{
					System.out.println("Thank you for wasting your time...");
				}

			}
			else 
			{
				System.out.println("Please First you have to create a Voter ID");
			}
		}
		else 
		{
			System.out.println("You are not mature to vote..Try after "+(18-age)+ "year/years.");	
		}
	}
}
