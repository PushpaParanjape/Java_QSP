import java.util.Scanner;
class ClaculateTips
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal :");
		double subTotal = sc.nextDouble();
		System.out.print("Enter the tip rate:");
		double tipRate = sc.nextDouble();
		
		double total = subTotal + tipRate*(subTotal/100);
		//double tip = tipRate/10;
		//double total = subtotal + tip ;
		
		//System.out.println("The total is :"+ total + " and tip is :"+tip);
		System.out.println("The total is :"+ total );
		System.out.print("Thank You Visit Again...");
		
	}
}