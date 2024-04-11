class MethodEg1
{
	public static void main(String[] args) {
		
		System.out.println("Hello from main()");
		m1();
		System.out.println("Bye from main()");
	}

	public static void m1() {
		System.out.println("Hii from m1()");

		String [] persons = {"Pushpa", "Shreya", "Shamal"};
		main(persons);
		System.out.println("byeee from m1()");
	}
}