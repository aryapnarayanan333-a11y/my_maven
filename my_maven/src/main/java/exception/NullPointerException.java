package exception;

public class NullPointerException {
	
	
	public void display()
	{
		try {
			String a=null;
			System.out.println(a.length());
			
		}
		catch(Exception b)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally code");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullPointerException ob=new NullPointerException();
		ob.display();

	}

}
