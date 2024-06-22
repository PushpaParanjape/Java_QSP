import java.util.*;
class StringMethods
// {
// 	public static void main(String[] args) 
// 	{
// 		String name1 = "Pushpa";
// 		String name2 = "Savan";
// 		String name3 = "Prachi";
// 		String name4 = " ";

// 		String convertedCaps = name1.toUpperCase();
// 		System.out.println(convertedCaps);

// 		int length = name2.length();
// 		System.out.println(length);

// 		char singleCharacter = name3.charAt(2);
// 		System.out.println(singleCharacter);

// 		String mergedNames = name1.concat(name3);
// 		System.out.println(mergedNames);

// 		String multipleChars = name1.substring(2,5); //substring(start_index, last_length)
// 		System.out.println(multipleChars);

// 		String singleChar = name2.substring(0,1);
// 		System.out.println(singleChar);

// 		boolean emptyOrNot = name4.isEmpty();
// 		System.out.println(emptyOrNot);
		
// 	}
// }


//WAJP to convert the first letter into capital and rest into lower case

// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter a name : ");
// 		String name = sc.nextLine();
// 		System.out.println("You entered :"+name);

// 		String firstChar = name.substring(0,1).toUpperCase();
// 		System.out.println(firstChar);
// 		String remainingLetters = name.substring(1,name.length()).toLowerCase();
// 		String merged = firstChar.concat(remainingLetters);
// 		System.out.println(merged);
		
// 	}
//}


//WAJP to get the ASCII values of all the characters dynamically
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.nextLine();

		for(int i = 0; i<name.length();i++)
		{
			int ascii = name.codePointAt(i);
			System.out.println(ascii);
		}
		
		// for(int i = 0; i<name.length();i++)
		// {
		// 	char name2 = name.charAt(i);
		// 	int ascii1 = name2;
		// 	System.out.println(ascii1+" ");
		// }

	
	}
}
