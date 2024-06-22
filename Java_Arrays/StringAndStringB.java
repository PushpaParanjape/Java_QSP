class StringAndStringB
{
	public static void main(String[] args) 
	{
		String name1 = new String("java");
		String name2 = new String("java");
		System.out.println(name1 == name2);//false

		StringBuffer sb1 = new StringBuffer("python");
		StringBuffer sb2 = new StringBuffer("python");
		System.out.println(sb1 == sb2);//false

		int a = 3;
		int b = 3;
		System.out.println(a==b);//true

		int i = 


		/*we can not ovveride the equals() method in StringBuffer class 
		b'coz the SB class is a predefined class and we dont have any
		 privileges to override it into predefined classes
		 */
	}
}