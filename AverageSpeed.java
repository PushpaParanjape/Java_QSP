/* Assume a runner runs 14km in 45min and 30sec.
WAP that displays the average speed in miles per hour.
Note= 1mile is 1.6km */

class AverageSpeed
{
	public static void main(String [] args)
	{
		double time = 45.5 /60 ; 		 
		double km = 14;
		double mile = km/1.6; 			//km in mile 
		double avgSpeed = mile/time;

		System.out.println("Time in sec :"+time);
		System.out.println("14 km = "+mile+"miles");
		System.out.println("Total :"+avgSpeed);
		

	}
}