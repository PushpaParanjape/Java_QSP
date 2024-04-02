//Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula :
// perimeter = 2*3.14*radius
//area 3.14*radius*radius

class PerimeterCircle
{
	public static void main( String [] args)
	{
		double radius = 5.5;
		double pi = 3.14;
		double area = pi*radius*radius;
		double perimeter = 2*pi*radius;

		System.out.println("The area of a circle is :"+area);
		System.out.println("The perimeter of a circle is :"+perimeter);
	}
}
