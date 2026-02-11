package abstractPackage;

public class ShapeMain extends ShapeClass {
	
	public void draw()
	{
		System.out.println("Draw a triangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeMain ob=new ShapeMain();
		ob.draw();
		ob.display();
	}

}
