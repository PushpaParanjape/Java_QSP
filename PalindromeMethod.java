import java.util.*;
class PalindromeMethod 
{
	public static void main(String[] args) {
		
		scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		int rev = reverseNum(int num);
	}

	public static  reverseNum(int num) {
		int rev = 0;
		while(num > 0);
		int rem = num % 10 ;
		rev = rev*10+rem;
		num /= 10;
		
	}
	return rev;
	
	public static void isPalindrome(int num, int rev) {

		if(num == rev)
		{
			System.out.println(num+"is Palindrome");
		}
		else
		{
			System.out.println(num + "not a Palindrome");
		}
		
	}
}