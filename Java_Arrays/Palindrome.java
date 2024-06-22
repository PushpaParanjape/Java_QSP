import java.util.*;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();

		int dup = num;
		int rev = 0;

		while(num > 0)
		{
			int reminder = num % 10;
			rev = (rev * 10) + reminder;
			num = num/10;
		}

		if(dup == rev)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		
	}
	
}


//Prime number
// class PrimeOrNot
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter a Number :");
// 		int num1 = sc.nextInt();

// 		int count = 0;

// 		for(int i = 2; i<num1; i++)
// 		{
// 			if(num1 % i == 0)
// 			{
// 				count++;
// 				break;
// 			}
// 		}
// 		if(count == 0)
// 		{
// 			System.out.println("prime");
// 		}
// 		else 
// 		{
// 			System.out.println("Not a prime");
// 		}
// 	}
// }


// //Fibonacci Series

// class Fibonacci
// {
// 	public static void main(String[] args) 
// 	{
// 		int num1 = 0;
// 		int num2 = 1;
// 		System.out.print(" "+num1+ " "+ num2);
		
// 		for (int i = 1; i<=10; i++ )
// 		{
// 			int op = num1 + num2;
// 			System.out.print(" "+op+" ");
// 			num1 = num2;
// 			num2 = op;
			
// 		}
// 	}
// }



// // java program to reverse a word

// class ReverseString 
// {
// 	public static void main (String[] args) 
// 	{
// 		String str= "Pushpa";
// 		String rev =" ";
// 		char ch;
	
// 	System.out.print("Original word: ");
// 	System.out.println(str); 
	
// 	for (int i=0; i<str.length(); i++)
// 	{
// 		ch = str.charAt(i); //extracts each character
// 		rev = ch+rev ; //adds each character in front of the existing string
// 	}
// 	System.out.println("Reversed word: "+ rev);
// 	}
// }


// //Factors of a number :
// class Factors
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter a number :");
// 		int num = sc.nextInt();

// 		int fact = 1;

// 		System.out.println("The factorial of given number is :");
// 		for(int i = 1; i<=num; i++)
// 		{
// 			if(num % i == 0)
// 			{
// 				System.out.print(i + " ");
// 			}
// 		}
// 	}
// }