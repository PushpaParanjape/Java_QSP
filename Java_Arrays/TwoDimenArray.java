//WAP to get input array size and display the array elements for 2 dimension of array

import java.util.*;
class TwoDimenArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of rows :");
		int rows = sc.nextInt();

		System.out.print("Enter the size of cols :");
		int cols = sc.nextInt();

		int [][] arr = new int [rows][cols];

		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("The 2D array is :");

		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<cols; j++)
			{
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
	}
}