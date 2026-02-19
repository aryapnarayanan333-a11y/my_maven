package exception;

public class SampleUserException {
	
	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("Not Eligible");
		}else
		{
			System.out.println("Eligible");
		}
	}
	
	
	public static void main (String args[]) throws LicenseException
	{
		SampleUserException ob=new SampleUserException();
		ob.test(13);
		
	}

}
