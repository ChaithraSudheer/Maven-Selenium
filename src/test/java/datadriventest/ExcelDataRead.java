package datadriventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataRead {
  @Test
  public void dataRead() throws IOException
  {
	  File f1=new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet--->row---cell---data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  /*
	  //single record
	  XSSFSheet sheet1=wb.getSheet("UserData");
	  XSSFRow row1=sheet1.getRow(1);
	  
	  XSSFCell cell=row1.getCell(0);
	  String value=cell.getStringCellValue();
	  System.out.println(value);
	  */
	  
	  /*
	  //one line code-read single record
	  String value=wb.getSheet("UserData").getRow(1).getCell(0).getStringCellValue();
	  System.out.println(value);
	  */
	  
	  //Read full data from excel
	  //number of rows
	  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();	  
	  System.out.println("No of rows are: "+rows);
	  
	  //no of cells
	  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();	  
	  System.out.println("No of columns are: "+cells);
	  
	  //create array as per size
	  Object data[][]=new Object[rows-1][cells];
	  
	  
	  //read data from file & save it in array-nested loop
	  for(int r=1;r<rows;r++)
	  {
		  for(int c=0;c<cells;c++)
		  {
			 data[r-1][c]= wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue();
			 System.out.println(data[r-1][c]);
		  }
	  }
	  
  }
}
