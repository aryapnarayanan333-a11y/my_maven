package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f; //non-primitive datatype
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readStringData(int i, int j) throws IOException // i represent row and j represent column
	{
		f=new FileInputStream("C:\\Users\\sreek\\OneDrive\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");//predefined method to get sheet
		XSSFRow r=s.getRow(i); //predefined rowclass r is variable= s is sheet variable
		XSSFCell c=r.getCell(j);//predefined column class r is variable= s is sheet variable
		return c.getStringCellValue(); // to fetch string value we are using return and predefined method name getstringvalue
	}
	
	public static double readIntegerData(int i, int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\sreek\\OneDrive\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");//predefined method to get sheet
		XSSFRow r=s.getRow(i); //predefined rowclass r is variable= s is sheet variable
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue(); // to fetch integer value we are using return and predefined method name getstringvalue
	
	}
}
