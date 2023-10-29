package Working_with_Excels;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {
	public static void main(String args[]) throws IOException
	{
		getrow();
		//getcelldata();
	}

	public static  void getrow() throws IOException
	{
		String projectpath=System.getProperty("user.dir");
		//System.out.println(projectpath);
		XSSFWorkbook workbook=new XSSFWorkbook("C://Users//Admin//eclipse-workspace//Selenium_java_maven_project_framework//Excel_file_data//demo.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row_count=sheet.getPhysicalNumberOfRows();
		System.out.println("Total No. of Rows in sheet are :- "+row_count);
		int col_count=sheet.getPhysicalNumberOfRows();
		System.out.println("Total No. of col in sheet are :- "+col_count);
//		
//		for (int i=1;i<row_count;i++)
//		{
//			for (int j=0; j<col_count;j++)
//			{
//				String celldataString=sheet.getcell
//			}
//		}
	}

	public static void getcelldata()
	{
		try {

			XSSFWorkbook workbook=new XSSFWorkbook("C://Users//Admin//eclipse-workspace//Selenium_java_maven_project_framework//Excel_file_data//demo.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			String celldata=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Data of First cell:-  " + celldata);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
