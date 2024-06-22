class StaticBlock
{
	static
	{
		System.out.println("Hello from Static Block 1");
		StaticBlock2.m1();
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi from main()");
		StaticBlock2.m1();	
	}
}

class StaticBlock2
{
	static
	{
		System.out.println("Hello from Static Block2");
	}
	public static void m1()
	{
		System.out.println("Hii from m1()");
	}
}