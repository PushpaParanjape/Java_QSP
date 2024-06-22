abstract class Arithmatic
{
	abstract int addition(int num1 , int num2);
	abstract int multiplication(int num1 , int num2);
	abstract int substraction(int num1 , int num2);
	abstract int division(int num1 , int num2);
	abstract int modulus(int num1 , int num2);
}

class ArithmaticImplimentation extends Arithmatic
{ 
	public int addition(int num1 , int num2)
	{
		return (num1+num2);
	}

	public int multiplication(int num1 , int num2)
	{
		return (num1 * num2);
	}

	public int substraction(int num1 , int num2)
	{
		return (num1 - num2);
	}

	public int division(int num1 , int num2)
	{
		return (num1 / num2);
	}

	public int modulus(int num1 , int num2)
	{
		return (num1 % num2);
	}
}
class ArithmaticExample
{
	public static void main(String[] args) 
	{
		ArithmaticImplimentation obj = new ArithmaticImplimentation();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.multiplication(10, 20));	
		System.out.println(obj.substraction(10, 20));
		System.out.println(obj.division(10, 20));
		System.out.println(obj.modulus(10, 20));
	}
}