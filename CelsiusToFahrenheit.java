/* Write a program that reads a Celsius degree in a double value from the console,
then convert it into Fehrenheit and displays the result.
Formula = Fehrenheit = (9/5)*celsius + 32
hint = in java 9/5 is 1, but 9.0/5 is 1.8 */

class CelsiusToFahrenheit
{
	public static void main(String [] args)
	{
		int celsius = 43;
		double fehrenheit = (9.0/5) *celsius + 32;

		System.out.println("The conversion of celsius into fehrenheit :"+fehrenheit);
	}
}

