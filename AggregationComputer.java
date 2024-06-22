class Computer
{
	String brand;
	long price;
	String color;
	CPU cpu;
	Monitor monitor;

	Computer(String brand, long price, String color)
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public void displayComputer()
	{
		System.out.println("*********Computer Information*********");
		System.out.println("Brand :"+this.brand);
		System.out.println("Price :" +this.price+"rs.");
		System.out.println("Color :" +this.color);
	}

	public void createInstanceOfCPU(int ram, int rom, String processor)
	{
		cpu = new CPU(ram, rom, processor);
	}

	public void createInstanceOfMonitor(String displayType, double size, double resolution)
	{
		monitor = new Monitor(displayType, size, resolution);
	}

}

class CPU
{
	int ram;
	int rom;
	String processor;

	CPU(int ram, int rom, String processor)
	{
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	public void displayCPU()
	{
		System.out.println();
		System.out.println("***CPU Information*****");
		System.out.println("RAM :" +this.ram+"GB");
		System.out.println("ROM :" +this.rom+"TB");
		System.out.println("Processor :" +this.processor);
	}
}

class Monitor
{
	String displayType;
	double size;
	double resolution;

	Monitor(String displayType, double size, double resolution)
	{
		this.displayType = displayType;
		this.size = size;
		this.resolution = resolution;
	}

	public void displayMonitor()
	{
		System.out.println();
		System.out.println("****Monitor Information****");
		System.out.println("Display Type :" +this.displayType);
		System.out.println("Size : "+this.size+"inch");
		System.out.println("Resolution :"+this.resolution+"p");
	}
}

class AggregationComputer
{
	public static void main(String[] args) 
	{
		Computer comp = new Computer("ACER", 90000, "Black");
		comp.displayComputer();
		comp.createInstanceOfCPU(8, 1, "Intel");
		comp.cpu.displayCPU();
		comp.createInstanceOfMonitor("LCD",24, 1080);
		comp.monitor.displayMonitor();
	}
}