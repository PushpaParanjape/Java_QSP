import java.util.*;
class ArmstrongNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");

		int num = sc.nextInt();
		int length = 0;
		int dup = num;
		int dup1 = num;
		int sum = 0;

		while(num != 0)
		{
			num/=10;
			length++;
		} 

		while (dup > 0)
		{
			int rem = dup % 10;
			int power = 1;

			for(int i = 1; i <= length; i++)
			{
				power = power*rem;
			}

			sum += power;
			dup/=10; 
		}

		if(sum == dup1)
		{
			System.out.println(dup1+" This Number Is Armstrong Number");
		}
		else
		{
			System.out.println(dup1+ " This number is not an Armstrong Number");
		}
	}
}