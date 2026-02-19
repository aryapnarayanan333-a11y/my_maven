package exception;

public class ThrowExceptionExercise {
	
	
	public static void license (int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Exception");
			
		}else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
		ThrowExceptionExercise.license(16);
		//}catch(Exception e)
		//{
			//System.out.println("Handled");
		//}

	}

}
