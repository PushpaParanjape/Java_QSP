import java.util.*;
class Student
{
	String name;
	String place;
	String branch;

	Student(String name, String place, String branch)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
	}

	public String toString()
	{
		return "My name is "+this.name + " I am from " + this.place + " and my branch is "+ this.branch;
	}
}


class ToStringOverrideEg
{
	public static void main(String[] args) 
	{
		Student stud1 = new Student("Pushpa", "Konkan", "Computer");
		System.out.println(stud1);

		Student stud2 = new Student("Samir", "Pune", "ENTC");
		System.out.println(stud2);
	}
}