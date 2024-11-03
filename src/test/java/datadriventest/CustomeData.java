package datadriventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomeData {

	// using array
	@DataProvider(name = "testdata1")
	public Object[][] testData() {
		Object data[][] = { { "Admin", "admin123" }, { "Sarang", "test123" }, { "Admin", "admin123" },
				{ "Pooja", "test123" } };
		return data;
	}

	// using excel
	@DataProvider(name = "ExcelData")
	public Object[][] fileData() {
		XSSFWorkbook wb;
		Object data[][] = null;
		File f1 = new File("./" + "\\TestData\\Data.xlsx");
		FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			// wb-->sheet--->row---cell---data
				wb = new XSSFWorkbook(fs);
				// number of rows
				int rows = wb.getSheet("UserData").getPhysicalNumberOfRows();
				System.out.println("No of rows are: " + rows);

				// no of cells
				int cells = wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
				System.out.println("No of columns are: " + cells);

				// create array as per size
				data = new Object[rows - 1][cells];

				// read data from file & save it in array-nested loop
				for (int r = 1; r < rows; r++) {
					for (int c = 0; c < cells; c++) {
						data[r - 1][c] = wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue();
						//System.out.println(data[r - 1][c]);
			   }
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}
}
