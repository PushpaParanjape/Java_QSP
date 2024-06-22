class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college;

	University(String name, String universityCode, int noOfColleges, String type, int establishedYear, int course)
	{
		this.name = name;
		this.universityCode = universityCode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}


	public void displayUniversity()
	{
		System.out.println();
		System.out.println("****University Information*****");
		System.out.println("Name :"+this.name);
		System.out.println("University Code :"+this.universityCode);
		System.out.println("Number of Colleges :"+this.noOfColleges);
		System.out.println("Type :"+this.type);
		System.out.println("Established Year :"+this.establishedYear);
		System.out.println("Course :"+this.course);
	}

	public void createInstanceOfCollege(String name, String collegeCode, String address, int noOfDepartments, char grade, int staffCount)
	{
		college = new College(name, collegeCode, address, noOfDepartments, grade, staffCount);
	}

}


class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDepartments;
	char grade;
	int staffCount;
	Department department;

	College(String name, String collegeCode, String address, int noOfDepartments, char grade, int staffCount)
	{
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDepartments = noOfDepartments;
		this.grade = grade;
		this.staffCount = staffCount;

	}

	public void displayCollege()
	{
		System.out.println();
		System.out.println("****College Information*****");
		System.out.println("Name :"+this.name);
		System.out.println("College Code :"+this.collegeCode);
		System.out.println("Address :"+this.address);
		System.out.println("No of Departments :"+this.noOfDepartments);
		System.out.println("Grade :"+this.grade);
		System.out.println("Staff Count :"+this.staffCount);

	}

	public void createInstanceOfDepartment(String name, String hodName, int classRoom, int noOfStaff, int noOfsubjects)
	{

	}
}



class Department
{
	String name;
	String hodName;
	int classRoom;
	int noOfStaff;
	int noOfsubjects;
	Teacher teacher;

	Department(String name, String hodName, int classRoom, int noOfStaff, int noOfsubjects)
	{
		this.name = name;
		this.hodName = hodName;
		this.classRoom = classRoom;
		this.noOfStaff = noOfStaff;
		this.noOfsubjects = noOfsubjects;
	}

	public void displayDepartment()
	{
		System.out.println();
		System.out.println("****Department Information*****");
		System.out.println("Name :"+this.name);
		System.out.println("HOD Name :"+this.hodName);
		System.out.println("Class Room :"+this.classRoom);
		System.out.println("No of Staff :"+this.noOfStaff);
		System.out.println("No of Subjects :"+this.noOfsubjects);
	}

	public void createInstanceOfTeacher(String name, String subject, long phoneNo, String qualification, double experience)
	{
		
	}
}

class Teacher
{
	String name;
	String subject;
	long phoneNo;
	String qualification;
	double experience;

	Teacher(String name, String subject, long phoneNo, String qualification, double experience)
	{
		this.name = name;
		this.subject = subject;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.experience = experience;
	}

	public void displayTeacher()
	{
		System.out.println();
		System.out.println("****Teacher Information*****");
		System.out.println("Name :"+this.name);
		System.out.println("Subject :"+this.subject);
		System.out.println("Phone Number :"+this.phoneNo);
		System.out.println("Qualification :"+this.qualification);
		System.out.println("Experience"+this.experience);

	}

}


class AggregationEg
{
	public static void main(String[] args) 
	{
		University obj = new University("SPPU", "Uni123",1100, "Government",1920, 300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("MODERN clg", "MOSPPU123", "Shivaji Nagar, Pune.", 10,'c',50);
		obj.college.displayCollege();
		obj.college.createInstanceOfDepartment("AI & ML", "C A Sonavane", 8, 8, 48);
		obj.college.department.displayDepartment();
		obj.college.department.createInstanceOfTeacher("ABC", "JAVA", 8769764536l, "MTECH", 5.5);
		obj.college.department.teacher.displayTeacher();


	}
}