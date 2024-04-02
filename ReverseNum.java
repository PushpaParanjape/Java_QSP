import java.util.*;
class ReverseNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		// int num = sc.nextInt();
		// int rev = 0;

		// while(num > 0)
		// {
		// 	int rem = num % 10 ;
		// 	rev = rev*10 + rem;
		// 	num/=10;
		// }
		// System.out.println(rev);
		// }

		/////////////////////////////////////////////// For 100 //////////////////////////////////////


		int number = sc.nextInt();
		String rev = "";
		while(number>0)
		{
			int rem = number % 10;
			rev = rev + rem;
			number /= 10;
		}
		System.out.println(rev);
		}
	}
