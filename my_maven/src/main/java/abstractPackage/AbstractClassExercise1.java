package abstractPackage;

public abstract class AbstractClassExercise1 {
	
	private final int accountno = 0;
	protected double balance;
	
	public abstract void calculateInterest();
	
	public void deposit(double amount)
	{
		
		if(amount>0) {
	
			balance=amount+balance;
		}
	}
}

