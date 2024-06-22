// WAP to store even and odd elements into two different arrays

import java.util.*;
class EvenOddArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size :");
		int size = sc.nextInt();

		System.out.print("Enter array elements :");
		int arr[] = new int [size];

		for (int i = 0; i< size; i++ ) 
		{
			arr[i] = sc.nextInt();
		}

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i< size; i++ ) 
		{
			if(arr[i] % 2 == 0)
			{
				evenCount++;
			}
			else 
			{
				oddCount++;
			}
		}

		int evenArray[] = new int [evenCount];
		int oddArray[] = new int [oddCount];

		int increment1 = 0;
		int increment2 = 0;

		for (int j = 0; j < size; j++) 
		{
			if(arr[j] % 2 == 0)
			{
				evenArray[increment1++] = arr[j];
			}
			else 
			{
				oddArray[increment2++] = arr[j];
			}
			
		}
		System.out.println("The Even Array is :" +Arrays.toString(evenArray));
		System.out.println("The Odd Array is :" +Arrays.toString(oddArray));
		
	}
}