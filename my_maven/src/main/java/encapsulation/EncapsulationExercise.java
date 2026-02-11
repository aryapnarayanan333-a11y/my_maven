package encapsulation;

public class EncapsulationExercise {
	
	private String name;
	private int Rollno;
	private int mark;
	
	public void setter(String name,int Rollno, int mark)
	{
		this.name=name;
		this.Rollno=Rollno;
		this.mark=mark;
		
		
	}
	
	public void getter()
	{
		System.out.println(name);
		System.out.println(Rollno);
		mark=100+mark;
		System.out.println(mark);
	}
	

}
