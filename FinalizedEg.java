class Employee
{
	String empName;
	String empId;

	Employee(String empName, String empId)
	{
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	protected void finalize()
	{
		System.out.println("Destroyed");
	}
	
}

class FinalizedEg
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Pushpa","emp3733");
		System.out.println(emp.empName);
		emp = null;	
		System.gc(); //call garbage collector explicitly
		System.out.println(emp.empName);	
	}
	
}