package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcel {

	public static void main(String[] args) throws Throwable {
		
		//step1:- path connection
				FileInputStream fis = new FileInputStream("./TestDAtaa.xlsx");
		       
				//step2:- excel sheet in read mode
				Workbook book = WorkbookFactory.create(fis);
		        
				//step3:- control on the sheet
				Sheet sheet = book.getSheet("Sheet1");
				
				Row row = sheet.createRow(2);

				Cell cel = row.createCell(2);
				
				cel.setCellValue("TestYantra");
				
				//Excel in Write Mode:-
				FileOutputStream fes = new FileOutputStream("./TestDAtaa.xlsx");
				book.write(fes);
				book.close();
	
	
	
	
	}

}
