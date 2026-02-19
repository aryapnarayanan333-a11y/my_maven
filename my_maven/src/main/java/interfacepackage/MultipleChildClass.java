package interfacepackage;

public class MultipleChildClass implements InterParent1,InterParent2{
	
	public void show()
	{
		System.out.println("Method of child class");
	}
	
	public void display()
	{
		System.out.println("ParentClass1 abstarct method");
	}
	
	public void print()
	{
		System.out.println("ParentClass2 abstarct method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MultipleChildClass ob=new MultipleChildClass();
		ob.show();
		ob.display();
		ob.print();
	}

}
