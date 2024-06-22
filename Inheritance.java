class Parent
{
	String str = "Hello from Parent class";

	void m1()
	{
		System.out.println("Hello from Parent m1()");
	}

	static void m3()
	{
		System.out.println("Hello from Parent static m3()");
	}
}

class Child extends Parent
{
	String str = "Hii from Child class";

	void m2()
	{
		System.out.println("Hii from Child m2()");
		m1();
		m3();
		System.out.println(str);//prints local variable....means Hii from Child m2()");

		System.out.println(super.str);//prints parent class variable
	}

	static void m4()
	{
		System.out.println("Hii from Child static m4()");
	}
}


class Inheritance
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();


		
	}
}