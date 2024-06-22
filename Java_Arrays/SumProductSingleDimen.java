//WAP to get a sum and product in single dimension of array

import java.util.*; 
class SumProductSingleDimen
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size :");
		int size = sc.nextInt();

		System.out.print("Enter array elements :");
		int arr[] = new int [size];
		int sum = 0;
		int prod = 1;

		//inserting array elements dynamically
		for (int i = 0; i< size; i++ ) 
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			prod = prod * arr[i];
		}

		System.out.println("Sum is :" +sum);
		System.out.println("Product is :"+prod);
		
	}
}