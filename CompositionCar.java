class CompositionCar
{
	String brand;
	String model;
	String type;
	double price;
	int settingCapacity;

	CompositionCar(String brand, String model, String type, double price, int settingCapacity)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.settingCapacity = settingCapacity;
	}

	public void displayCar()
	{
		System.out.println("******* Car Details ********");
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Type :"+type);
		System.out.println("Price :"+price);
		System.out.println("Setting Capacity :"+settingCapacity);
	}	
}


class Engine
{
	double horsePower;
	double capacity;
	String engineType;
	double mileage;
	int noOfPistons;


	Engine(double horsePower, double capacity, String engineType, double mileage, int noOfPistons)
	{
		this.horsePower = horsePower;
		this.capacity = capacity;
		this.engineType = engineType;
		this.mileage = mileage;
		this.noOfPistons = noOfPistons;
	}

	public void displayEngine()
	{
		System.out.println("***** Engine Details *******");
		System.out.println("Horse Power :"+horsePower);
		System.out.println("Capacity :"+capacity);
		System.out.println("Engine Type :"+engineType);
		System.out.println("Mileage :"+mileage);
		System.out.println("Number of Pistons :"+ noOfPistons);
	}
}

class CarDriver
{
	public static void main(String[] args) 
	{
		CompositionCar car = new CompositionCar("TATA", "NEXON", "SUV", 9000000, 5);
		car.displayCar();
	}
}
