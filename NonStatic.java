class NonStatic
{
	String str = "Hi I am from NonStatic class";

	public static void main(String[] args) 
	{
		System.out.println("Hello I am from main()");
		NonStatic1 obj = new NonStatic1();
		obj.m1();
	}
}

class NonStatic1
{
	static NonStatic obj = new NonStatic();
	void m1()
	{
		System.out.println("Hi I am from m1()");
		System.out.println(obj.str);
		m2();
	}

	void m2()
	{
		System.out.println("Hi I am from m2()");
		System.out.println(obj.str);
		m3();
	}

	static void m3()
	{
		System.out.println("Hi I am from static m3()");
		System.out.println(obj.str);
	}
}
