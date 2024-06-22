//Example of composition

class CompositionCar
{
	String brand;
	String model;
	String type;
	double price;
	int settingCapacity;
	Engine engine; //2nd way, 3rd way
	
	//Engine engine = new Engine(120, 1.2, "Petrol", 16, 4); //1st way

	 CompositionCar(String brand, String model, String type, double price, int settingCapacity) 
	//CompositionCar(String brand, String model, String type, double price, int settingCapacity,Engine engine)//3rd way
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.settingCapacity = settingCapacity;
		//this.engine = engine;//3rd way
		this.engine = new Engine(120, 1.2, "Petrol", 16, 4);//4th way 

		//engine = new Engine(120, 1.2, "Petrol", 16, 4); //2nd way
	}

	public void displayCar()
	{
		System.out.println("\n******* Car Details ********");
		System.out.println("Brand :"+this.brand);
		System.out.println("Model :"+this.model);
		System.out.println("Type :"+this.type);
		System.out.println("Price :"+this.price);
		System.out.println("Setting Capacity :"+this.settingCapacity);
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
		System.out.println("\n***** Engine Details *******");
		System.out.println("Horse Power :"+this.horsePower+" bph");
		System.out.println("Capacity :"+this.capacity+" lit");
		System.out.println("Engine Type :"+this.engineType);
		System.out.println("Mileage :"+this.mileage+" km/l");
		System.out.println("Number of Pistons :"+ this.noOfPistons);
	}
}

class CarDriverNew
{
	public static void main(String[] args) 
	{
		CompositionCar car = new CompositionCar("TATA", "NEXON", "SUV", 9000000, 5);
		//CompositionCar car = new CompositionCar("TATA", "NEXON", "SUV", 9000000, 5,(new Engine(120, 1.2, "Petrol", 16, 4)));//3rd way
		car.displayCar();
		car.engine.displayEngine();
	}
}
