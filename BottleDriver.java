// Program for non - static

class Bottle
{
	String material;
	double cap ;
	double weight ;

	void displayBottle()
	{
		System.out.println(material + " " + cap + " " + weight);
	}
}

class BottleDriver
{
	public static void main(String[] args) 
	{
		Bottle obj = new Bottle();
		obj.displayBottle();
	}
}