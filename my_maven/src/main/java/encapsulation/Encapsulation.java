package encapsulation;

public class Encapsulation {
	
	private String name;
	private int salary;
	
	public void setter(String name,int salary) //setter method to modify or edit
	{
		this.name=name;
		this.salary=salary;
		
	
	}
	
	public void getter() // getter method to view
	{
		System.out.println(name);
		int incentive=1200;
		salary=salary+incentive;
		System.out.println(salary);
	}

}
