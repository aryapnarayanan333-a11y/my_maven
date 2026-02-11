package methodoverriding;

public class ChildOverride extends ParentOverride {
	@Override
	public void display()
	{
		super.display(); // we can use super keyword to see parent class method override method
		System.out.println("this is child class method override");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOverride ob=new ChildOverride();
		ob.display();
		ParentOverride obj=new ParentOverride();//Also we can also create parent class object to display parent class methodoverrided method
		obj.display();
		
		
	}

}
