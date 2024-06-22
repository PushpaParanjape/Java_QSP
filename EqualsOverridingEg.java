class Student
{
	String name;
	String place;
	String branch;
	int yearOfPassout;

	Student(String name, String place, String branch, int yearOfPassout)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
		this.yearOfPassout = yearOfPassout;
	}

	public boolean equals(Object obj)
	{
		Student stud2 = (Student)obj;
		if((this.name == stud2.name) && (this.place == stud2.place) && (this.branch == stud2.branch) && (this.yearOfPassout == stud2.yearOfPassout))
			return true;
		else
			return false;
	}
}

class EqualsOverridingEg
{
	public static void main(String[] args) {

		Student stud1 = new Student("Pushpa", "Pune", "Computer", 2024);

		Student stud2 = new Student("Pushpa", "Pune", "Computer", 2024); 
		System.out.println(stud1.equals(stud2));
		
	}
}