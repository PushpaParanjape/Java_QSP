abstract class ReserverBankOfIndia
{
	ReserverBankOfIndia()
	{
		super();
	}

	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositLimit();
}

abstract class SBI extends ReserverBankOfIndia
{
	String userName;
	String accType;

	SBI(String userName, String accType)
	{
		super();

		this.userName = userName;
		this.accType = accType;
	}

	public void displayDetails()
	{
		System.out.println("Account holder name : "+this.userName);
		System.out.println("Account type :"+this.accType);
	}
}

class Saving extends SBI
{
	Saving(String userName, String accType)
	{
		
		this.userName = userName;
		this.accType = accType;
	}
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest for Saving acc :"+ 8.5 + "%");
	}

	public void withdrawLimit()
	{
		System.out.println("Withdraw Limit for Saving acc :"+ 500000 + "rs.");
	}

	public void depositLimit()
	{
		System.out.println("Deposit Limit for Saving acc :"+ 1000000 + "%");
	}
}


class Current extends SBI
{
	Current(String userName, String accType)
	{
		
		this.userName = userName;
		this.accType = accType;
	}

	public void rateOfInterest()
	{
		System.out.println("Rate of Interest for Current acc :"+ 7.5 + "%");
	}

	public void withdrawLimit()
	{
		System.out.println("Withdraw Limit for Current acc :"+ 5000000 + "rs.");
	}

	public void depositLimit()
	{
		System.out.println("Deposit Limit for Current acc :"+ 1000000 + "%");
	}
}

class AbstractionEgRBI
{
	public static void main(String[] args) 
	{
		Saving obj = new Saving("Pushpa", "Saving");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.withdrawLimit();
		obj.depositLimit();

		Current obj1 = new Current("Samira", "Current");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositLimit();
		
	}
}