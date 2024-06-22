//WAJP to fetch all the prime numbers from the array
import java.util.*;
class ArrayPrime
{
	public static void main(String[] args) 
	{
		
	int []arr = {2,5,8,9,12,45,31,7,3};

	for(int i = 0; i<arr.length; i++)
	{
		int count = 0;
		for(int j = 1;j <= arr[i];j++) 
		{
			if(arr[i] % j == 0)
			{
				count++;
			}
		}

		if(count == 2)
		{
			System.out.print(arr[i]+" ");
		}
	}
	}
}
