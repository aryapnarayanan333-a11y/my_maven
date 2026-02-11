package exception;

public class ExceptionSample {

	
	public void display()
	{
		int a=10;
		int b=a/0; //arithmetic Exception
		System.out.println(b);
	}
	
	public static void main (String[] args) {
		
		ExceptionSample ob=new ExceptionSample();
		System.out.println("End of statement");
		ob.display();  // no code is executed once exception is occured. exception code is this method and line number 9 and 10;
		System.out.println("End of statement");
	}
}
