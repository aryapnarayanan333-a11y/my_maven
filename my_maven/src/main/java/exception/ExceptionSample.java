package exception;

public class ExceptionSample {

	
	public void display()
	{
		int a=10;
		try {
			int b=a/0; //arithmetic Exception
			System.out.println(b);
		}
		catch(Exception e){ // exception is handled via catch block
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally {// codes inside finally will be executed anyway eventhough it is not handled via catch block. finally block will execute and exception will be displayed.
			System.out.println("Exception finally");
		}
	}
	
	public static void main (String[] args) {
		
		ExceptionSample ob=new ExceptionSample();
		System.out.println("End of statement");
		ob.display();  // no code is executed once exception is occured. exception code is this method and line number 9 and 10;
		System.out.println("End of statement");
	}
}
