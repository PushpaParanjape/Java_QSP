class Account
{
	String accHolderName;
	int accountNo;
	String ifscCode;
	int transactionLimit;
	double balance;
	double withdrawLimit;

	Account(String accHolderName, int accountNo, String ifscCode, int transactionLimit, double balance, double withdrawLimit)
	{
		super();
		this.accHolderName = accHolderName;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.transactionLimit = transactionLimit;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void displayAccountDetails()
	{
		System.out.println("***Account Details***");
		System.out.println("Account Holder Name :"+this.accHolderName);
		System.out.println("Account Number :"+this.accountNo);
		System.out.println("IFSC Code :"+this.ifscCode);
		System.out.println("Per Day Transaction Limit :"+this.transactionLimit);
		System.out.println("Current Balance :"+this.balance);
		System.out.println("Per Day Withdraw Limit :"+this.withdrawLimit);
	}

}
class SavingAcc extends Account
{
	
	String accType;
	String purpose;
	double minBalance;

	SavingAcc(String accType, String purpose, double minBalance, String accHolderName, int accountNo, String ifscCode, int transactionLimit, double balance, double withdrawLimit)
	{
		super(accHolderName, accountNo, ifscCode, transactionLimit, balance, withdrawLimit);
		this.accType = accType;
		this.purpose = purpose;
		this.minBalance = minBalance;
	}

	public void displaySavingAcc()
	{
		System.out.println("***Saving Account Details ***");
		System.out.println("Account Type :"+this.accType);
		System.out.println("Purpose to open Account :"+this.purpose);
		System.out.println("Minimum balance :"+this.minBalance);
	}

}
 class CurrentAcc
 {
 	
	String accType;
	String purpose;
	double minBalance;

	CurrentAcc(String accType, String purpose, double minBalance, String accHolderName, int accountNo, String ifscCode, int transactionLimit, double balance, double withdrawLimit)
	{
		super(accHolderName, accountNo, ifscCode, transactionLimit, balance, withdrawLimit);
		this.accType = accType;
		this.purpose = purpose;
		this.minBalance = minBalance;
	}

	public void displayCurrentAcc()
	{
		System.out.println("***Current Account Details ***");
		System.out.println("Account Type :"+this.accType);
		System.out.println("Purpose to open Account :"+this.purpose);
		System.out.println("Minimum balance :"+this.minBalance);
	}
 }
class SalaryAcc
{
	
	String accType;
	String purpose;
	double minBalance;

	SalaryAcc(String accType, String purpose, double minBalance, String accHolderName, int accountNo, String ifscCode, int transactionLimit, double balance, double withdrawLimit)
	{
		super(accHolderName, accountNo, ifscCode, transactionLimit, balance, withdrawLimit);
		this.accType = accType;
		this.purpose = purpose;
		this.minBalance = minBalance;
	}

	public void displayCurrentAcc()
	{
		System.out.println("***Salary Account Details ***");
		System.out.println("Account Type :"+this.accType);
		System.out.println("Purpose to open Account :"+this.purpose);
		System.out.println("Minimum balance :"+this.minBalance);
	}
}

class HierarchicalEg
{
	public static void main(String[] args) 
	{
		//SavingAcc saving = new SavingAcc();
		
	}
}