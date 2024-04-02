import java.util.Scanner;
class Month
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a months number :");
		int monthNum = sc.nextInt();
		String month = null ;
		switch (monthNum)
		{
		case 1: month = "JAN"; break;		
		case 2: month = "FEB"; break;
		case 3: month = "MARCH"; break;
		case 4: month = "APRIL"; break;
		case 5: month = "MAY"; break;
		case 6: month = "JUNE"; break;
		case 7: month = "JULY"; break;
		case 8: month = "AUG"; break;
		case 9: month = "SEPT"; break;
		case 10: month = "OCT"; break;
		case 11: month = "NOV"; break;
		case 12: month = "DEC"; break;
		default: System.out.println("Invalid Input");
		}
		if (month != null)
		{
			System.out.println(monthNum + " - "  +month);
		}
	}
}