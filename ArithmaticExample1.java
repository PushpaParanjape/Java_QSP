abstract class Parent
{
	abstract void m1();
	abstract void m2();
	public void m3()
	{
		System.out.println("Parent m3()");
	}
}

abstract class Child1 extends Parent
{
	public void m2()
	{
		System.out.println("M2 implements child1");
	}

	abstract void m4();

}

class Child2 extends Parent
{
	public void m1()
	{
		System.out.println("M1 implements child2");
	}

	public void m2()
	{
		System.out.println("M2 implements child2");
	}

	public void m5()
	{
		System.out.println("M5 implements child2");
	}

}

class SubChild extends Child1
{
	public void m1()
	{
		System.out.println("m1 implements SubChild ");
	}

	public void m4()
	{
		System.out.println("m4 implements SubChild");
	}

}

class ArithmaticExample1
{
	public static void main(String[] args) 
	{
		Child2 obj = new Child2();
		obj.m1();
		obj.m2();
		obj.m5();
		obj.m3();

		SubChild obj1 = new SubChild();
		obj1.m1();
		obj1.m4();
		obj1.m2();
		obj1.m3();
		
		
		
	}
}