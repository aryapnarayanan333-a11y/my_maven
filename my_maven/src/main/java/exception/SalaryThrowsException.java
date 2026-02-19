package exception;

public class SalaryThrowsException {
	
	public void salary(int salary) throws SalaryException
	{
		if(salary<100)
		{
		throw new SalaryException("Not Eligible");
	}else
	{
		System.out.println("Eligible");
	}
}

	public static void main(String[] args) throws SalaryException {
		// TODO Auto-generated method stub
		
		SalaryThrowsException ob=new SalaryThrowsException();
		ob.salary(99);

	}

}
