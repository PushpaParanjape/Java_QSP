import java.util.*;
class EmployeeManagementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*******WELCOME*********");
		System.out.println();

		features :
		for (; ; ) 
		{
			System.out.println("********FEATURES********");
			System.out.println("1. Add new Employee");
			System.out.println("2. View all the Employee");
			System.out.println("3. Edit Employee");
			System.out.println("4. Exit");
			System.out.println();

			System.out.print("Enter a option : ");
			int opt = sc.nextInt();

			System.out.println();

			switch(opt)
			{
			case 1 :
				{
					addNewEnployee();
					break;

				}
			case 2 :
				{
					viewEmployee(1);
					break;
					
				}
			case 3 :
				{

					for (; ; ) 
					{
					
					System.out.println("*********Edit Employee Data********** ");
					System.out.println("1. Edit Employee Name :");
					System.out.println("2. Edit Employee Salary : ");
					System.out.println("3. Edit Employee Role : ");
					System.out.println("4. Exit");
					System.out.println();
					System.out.print("Choose option : ");
					int option = sc.nextInt();
					
					switch(option)
					{
					case 1 :
						{
							editEmpName();
							break;	
						}
					case 2 :
						{
							editEmpSalary();
							break;
						}
					case 3 :
						{
							editEmpRole();
							break;
						}
					case 4 :
						{
							System.exit(0);
						}
					default :System.out.print("Invalid choice");
					}	
					}
				}
			case 4 :
				{
					System.exit(0);
				}
			default :
				{
					System.out.println("Incorrect Option..");
				}
			}
			
		}

	}
	public static void addNewEnployee()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("**** Enter new employee data ****");
		System.out.print("Employee name : ");
		ename = sc.nextLine();
		System.out.print("Employee ID : ");
		eid = sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Role : ");
		erole = s.nextLine();
		System.out.print("Employee Salary : ");
		esal = s.nextDouble();
	}

	public static void viewEmployee(int eid1)
	{
		if(eid == eid1)
		{

			System.out.println();
			System.out.println("Employee data");
			System.out.println("Name : "+ ename);
			System.out.println("Emp ID : " +eid);
			System.out.println("Role : " + erole);
			System.out.println("Salary : " + esal);
			System.out.println();
		}
		else
		{
			System.out.println("Wrong EID");
		}
	}

	public static void editEmpName() 
		
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Edit name : ");
			ename = sc.nextLine();
			System.out.println("Name is Updated");
			//viewEmployee(1);

		}
		
	

	public static void editEmpSalary()
	{

		Scanner sc = new Scanner (System.in);
		System.out.print("Edit Salary : ");
		esal = sc.nextInt();
		System.out.println("Salary is updated...");
		//viewEmployee(1);

	}

	public static void editEmpRole()
	{

		Scanner s = new Scanner (System.in);
		System.out.print("Edit Employee role : ");	
		erole = s.nextLine();
		System.out.println("Employee role updated..");
		//viewEmployee(1);
	} 

}