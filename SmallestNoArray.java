//Find Smallest Number from given Array

class SmallestNoArray
{
	public static void main(String[] args) 
	{
		int arr[] = {20, 3, 5, 7, 9, 11};
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			if(min>arr[i])
			{
				min = arr[i];
				//System.out.println(min);
			}
		}
		System.out.println("The Min element is " +min);
	}
}



//Find Biggest Number from given Array

// class SmallestNoArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int arr[] = {20, 3, 5, 7, 9, 11};
// 		int min = arr[0];

// 		for (int i = 0; i < arr.length; i++) 
// 		{
// 			System.out.println(arr[i]);
// 			if(min<arr[i])
// 			{
// 				min = arr[i];
// 				//System.out.println(min);
// 			}
// 		}
// 		System.out.println("The Max element is " +min);
// 	}
// }