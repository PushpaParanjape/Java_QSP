//Write a program that displays the area and the  perimeter of a rectangle with the 
//width of 4.5 and height 7.9 using formula:
//area = width*height
//perimeter = 2*(width+height)

class AreaPeriOfRectangle
{
	public static void main(String [] args)
	{
		double width = 4.5;
		double height = 7.9;
		double area = width * height;
		double perimeter = 2*(height + width);

		System.out.println("Area of the Rectangle :"+area);
		System.out.println("Perimeter of a Rectangle :"+perimeter);

	}
}