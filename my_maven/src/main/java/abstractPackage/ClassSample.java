package abstractPackage;

public class ClassSample extends AbstractClass {
	
	public void print()
	{
		System.out.println("this is abstract class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassSample obj=new ClassSample();
		obj.print();
		obj.display();
	
	}

}
