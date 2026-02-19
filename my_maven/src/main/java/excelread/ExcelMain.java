package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String S=ExcelCode.readStringData(0, 0); //classname.method name as method is static
		
		double S1=ExcelCode.readIntegerData(0, 1);  //classname.method name as method is static
		System.out.println(S);
		System.out.println(S1);

	}

}
