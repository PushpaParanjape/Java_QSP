import java.util.*;
class BankApplication
{
	private String accountHolderName;
	private String address;
	private long adharNumber;
	private String panNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;


	public static void createAccount()
	{
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter Your Name :");
				
				String accountHolderName = sc.nextLine();
				// bank.getAccountHolderName(accountHolderName);
				// bank.setAccountHolderName(accountHolderName);

				System.out.print(" Enter your address :");
				String address = sc.nextLine();
				// bank.getAddress(address);
				// bank.setAddress(address);

				System.out.print("Enter Your Adhar Number :");
				long adharNumber = sc.nextLong();
				bank.getAdharNumber(adharNumber);

				System.out.print("Enter your Pan Number :");
				String panNumber = sc.nextLine();
				bank.getPanNumber(panNumber);

				System.out.print("Enter your Upi Pin :");
				int upiPin = sc.nextInt();
				bank.getUpiPin(upiPin);
				bank.setUpiPin(upiPin);

				System.out.print("Enter the deposit balance :");
				double balance = sc.nextDouble();
				bank.getBalance(balance);
				bank.setBalance(balance);

				System.out.print("Enter your Phone Number :");
				long phoneNumber = sc.nextLong();
				bank.getPhoneNumber(phoneNumber);
				bank.setPhoneNumber(phoneNumber);


	} 



	BankApplication(String accountHolderName, String address, long adharNumber, String panNumber, int upiPin, double balance, long phoneNumber)
	{
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.upiPin = upiPin;
		this.balance = balance;
		this.phoneNumber = phoneNumber;



	}

	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String updateAccountHolderName)
	{
		accountHolderName = updateAccountHolderName;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String updateAddress)
	{
		address = updateAddress;
	}

	public long getAdharNumber()
	{
		return adharNumber;
	}

	public String getPanNumber()
	{
		return panNumber;
	}

	public int getUpiPin()
	{
		return upiPin;
	}

	public int setUpiPin(int updateUpiPin)
	{
		upiPin = updateUpiPin;
	}

	public double getBalance()
	{
		return balance;
	}

	public double setBalance(double updateBalance)
	{
		balance = updateBalance;
	}

	public long getPhoneNumber()
	{
		return phoneNumber;
	}

	public long setPhoneNumber(long updatePhoneNumber)
	{
		phoneNumber = updatePhoneNumber;
	}


	

	public static void bankService()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose your service : ");
		System.out.println("1. Create Account");
		System.out.println("2. Existing user");
		int ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			{
				System.out.println("Create Account");
				createAccount();
				break;
			}
		case 2 :
			System.out.println("Existing user");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}


	

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		bankService();
		createAccount();

		BankApplication bank = new BankApplication("aa","bb",123,"a24",11234,20000000,78654890);
		
		bank.getAccountHolderName("accountHolderName");
		bank.setAccountHolderName("new1");
		bank.getAddress("address");
		bank.setAddress("new2");
	}

}


/////////////////////////////////	Existing User Method 	////////////////////////////////////////////////////////////
/*
import java.util.*;

class BankApplication
{
	public static void main(String[] args) 
	{
		
		existingUser();	
	}

	public static void existingUser()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Check Balance ");
		System.out.println("2. Deposit Account ");
		System.out.println("3. Withdraw Account ");
		System.out.println("4. Update Account ");
		System.out.println("5. Logout ");
		System.out.print("Enter your Choice :");
		int ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			System.out.println("your balance is :");
			break;

		case 2:
			{
				System.out.println("Deposit Money");
			 	public void deposit() {  
        		long amount;  
        		System.out.println("Enter the amount you want to deposit: ");  
       			amount = sc.nextLong();  
        		balance = balance + amount;

			break;
			}
		case 3:
			System.out.println("Withdraw Account");
			public void withdrawal() 
			{  
        	long amt;  
        	System.out.println("Enter the amount you want to withdraw: ");  
        	amt = sc.nextLong();  
        	if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        	}
        	else 
        	{  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        	}
        	break;  
    		}  
			

		case 4:
			System.out.println("Updated Account");
			updateAccount();
			break;

		case 5:
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
		}
}

	public static void updateAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Enter Account Holder Name :");
		System.out.println("2. Enter Your Address :");
		System.out.println("3. Enter A UPI Pin :");
		System.out.println("4. Enter your Phone Number :");
		System.out.print("Enter the option :");
		int ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			System.out.print("1. Enter Account Holder Name :");
			String name = sc.nextLine();
			break;

		case 2:
			String address = sc.nextLine();
			break;

		case 3:
			int upiPin = sc.nextInt();
			break;

		case 4:
			long phone = sc.nextLong();
			break;

		default:
			System.out.println("Invalid Choice");

		}
	} 

	}
*/