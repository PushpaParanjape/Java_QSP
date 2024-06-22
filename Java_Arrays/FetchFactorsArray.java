//WAJP to find the factors of a number and store all the factors in an array

import java.util.*;
class FetchFactorsArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		int factorCount = 0;

		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				factorCount++;
			}
		}

		int [] factorsArray = new int [factorCount];
		int increment = 0;
		for(int j = 1; j <= num; j++)
		{
			if(num % j == 0)
			{
				factorsArray[increment++] = j;
			}
		}
		System.out.println(Arrays.toString(factorsArray));
	}
}