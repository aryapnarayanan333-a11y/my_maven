package interfacepackage;

public class SampleExercise implements InterfaceExercise {
	int area;
	
	public void area()
	{
	 area=length*breadth;
	 System.out.println(area);
	 
	}
	
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
	
	public void shape()
	{
		System.out.println("Class shape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleExercise ob=new SampleExercise();
		ob.area();
		ob.draw();
		ob.shape();
		
		
		InterfaceExercise obj=new SampleExercise();
		obj.area();
		obj.draw();
		//obj.shape();
				
		

	}

}
