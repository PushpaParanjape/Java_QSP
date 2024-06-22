class Human implements Cloneable
{
	String name; 
	String place; 
	String gender;
	String profession;

	Human(String name, String place, String gender, String profession)
	{
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.profession = profession;
	}

	public String toString()
	{
		return this.name + " , " +this.place + " , " + this.gender + " , " + this.profession + ".";
	}

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class CloneMethodEg
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Human obj = new Human("Pushpa", "Pune", "Female", "Student");
		System.out.println(obj);

		Human obj1 = (Human)obj.clone();
		System.out.println(obj1);

	}
}