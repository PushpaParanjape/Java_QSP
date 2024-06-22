//WAP to merge 2 Arrays into one single Array

import java.util.*;
class MergeArrays
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st array size :");
		int size1 = sc.nextInt();
		System.out.print("Enter the 2nd array size :");
		int size2 = sc.nextInt();

		System.out.println("This is 1st array :");
		int arr1[] = new int[size1];
		for (int i = 0; i< size1; i++ ) 
		{
			arr1[i] = sc.nextInt();
		}


		System.out.println("This is 2nd array :");
		int arr2[] = new int[size2];
		for (int i = 0; i< size2; i++ ) 
		{
			arr2[i] = sc.nextInt();
		}


		//Code for merging the Array elements
		//creating a var for merge the arrays
		int mergedArraySize = size1 + size2;
		int [] mergedArray = new int [mergedArraySize];

		for(int i = 0; i < arr1.length; i++)
		{
			mergedArray[i] = arr1[i];

		}

		for(int j = 0; j < arr2.length; j++)
		{
			mergedArray[arr1.length + j] = arr2[j];
		}
		System.out.println("Mergerd array is :" +Arrays.toString(mergedArray));
	}
}