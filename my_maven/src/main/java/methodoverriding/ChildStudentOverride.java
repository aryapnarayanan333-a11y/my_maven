package methodoverriding;

public class ChildStudentOverride extends StudentParentOverride {
	
	public void Studentdetails(String name)
	{
		
		System.out.println("Child name"+" "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildStudentOverride ob=new ChildStudentOverride();
		ob.Studentdetails("Arya");

	}

}
