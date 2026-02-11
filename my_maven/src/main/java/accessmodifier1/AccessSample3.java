package accessmodifier1;

import acessmodifier.AccessSample1;

public class AccessSample3 extends AccessSample1 { //accessmodifier with different package with extends keyword from other package class can take public and protected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample3 obj=new AccessSample3();
		System.out.println(obj.a);
		//System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d);
		
		
	}

}
