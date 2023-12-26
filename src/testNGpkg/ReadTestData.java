package testNGpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("excelSheets\\testdata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("addCategory");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		Object data[][] = new Object[rows][cols];
		System.out.println("no of rows " + rows);
		System.out.println("no of cols " + cols);
		System.out.println("length of array  is " + data.length);
		System.out.println("length of columns of array  is " + data[1].length);

		for (int i =2 ; i < rows-1; i++) {
			XSSFRow rowdata = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				 data[i-2][j]=rowdata.getCell(j);
				XSSFCell cellValue=rowdata.getCell(j);
				System.out.print(cellValue+"    ");
				//System.out.println(Arrays.toString(data));
			}
			System.out.println();

		}

	}

}
