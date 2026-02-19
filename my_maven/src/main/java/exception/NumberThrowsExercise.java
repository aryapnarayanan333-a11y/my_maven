package exception;

public class NumberThrowsExercise {
	
	public void number(int a)
	{
		if(a<0)
		{
			throw new ArithmeticException("Number is invalid");
		}else
		{
			System.out.println("Number is valid");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberThrowsExercise ob=new NumberThrowsExercise();
		ob.number(-2);

	}

}
