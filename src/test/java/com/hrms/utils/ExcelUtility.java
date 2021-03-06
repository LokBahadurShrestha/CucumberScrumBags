package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;
	private static void openExcel(String filePath) {
		
		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			book = new XSSFWorkbook(fileIS);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}
private static int rowCount() {
	return sheet.getPhysicalNumberOfRows();
}
private static int colsCount(int row) {
	return sheet.getRow(row).getLastCellNum();
}
private static String cellData(int rowIndex,int colIndex) {
	return sheet.getRow(rowIndex).getCell(colIndex).toString();
}
//return a 2D object array of data
public static Object[][]ExcelIntoArray(String filePath,String sheetName){
	openExcel(filePath);
	loadSheet(sheetName);
	int rows=rowCount();
	int cols=colsCount(0);
	Object[][]data=new Object[rows-1][cols];
	// iterating rows
			for (int i = 1; i < rows; i++) {

				// iterating cols
				for (int j = 0; j < cols; j++) {
					data[i - 1][j] = cellData(i, j);
				}
			}

			return data;
	
}
public static List<Map<String,String>>excelIntoListOfMaps(String filePath,String sheetName){
	openExcel(filePath);
	loadSheet(sheetName);
	List<Map<String,String>>list=new ArrayList<>();
	Map<String,String>excelMap;
	
	for(int row=1;row<rowCount();row++) {
		excelMap=new LinkedHashMap<>();
		for(int col=0;col<colsCount(row);col++) {
			
			String key=cellData(0,col);
			String value=cellData(row,col);
			
			excelMap.put(key,value);
			
		}
		list.add(excelMap);
	}
	return list;
	
}

}
