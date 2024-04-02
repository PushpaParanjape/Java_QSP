import  java.util.*;
class PowerOfNum
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int duplicate = num;
		int length = 0;
		int power = 1;

		while(num != 0)
		{
			num /=10;
			length++;
			
		}

		for(int i = 1; i <= length; i++)
		{
			power = power*duplicate; //power *= num; 
		}

		System.out.println("The power of number is : "+power);
	}
}