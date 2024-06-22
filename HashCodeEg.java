class Human
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

	// public int hashCode()
	// {
	// 	return 
	// }

	public String toString()
	{
		return this.name + " , " +this.place + " , " + this.gender + " , " + this.profession + " . ";
	}

}

class HashCodeEg
{
	public static void main(String[] args) 
	{
		Human obj = new Human("Pushpa", "Pune", "Female", "Student");
		System.out.println(obj);
	}
}