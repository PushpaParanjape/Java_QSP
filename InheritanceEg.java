//Inheritance Examples
class Parent
{
		String s1 = "Hi I am from PArent class";
		void m1()
		{
			System.out.println("Hello I am from m1()");
		}

		static void m3()
		{
			System.out.println("Hello I am from static m3()");
		}
}
class Child extends Parent
{
	String s1 = "Hi I am from child class";

	void m2()
	{
		System.out.println("hello i am from childs m2()");
		m3();
		m1();
		System.out.println(s1);
		System.out.println(super.s1);
	}

	static void m4()
	{
		System.out.println("Hello I am from Static method m4()");
	}
}

class InheritanceEg
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.s1);
		
	}
}