package Reporting.ApachePoi;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteListToExcelFile {

	public static void writeCountryListToFile(String fileName, List<Country> countryList) throws Exception{
		Workbook workbook = null;
		
		if(fileName.endsWith("xlsx")){
			workbook = new XSSFWorkbook();
		}else if(fileName.endsWith("xls")){
			workbook = new HSSFWorkbook();
		}else{
			throw new Exception("invalid file name, should be xls or xlsx");
		}
		
		Sheet sheet = workbook.createSheet("Countries");
		
		Iterator<Country> iterator = countryList.iterator();
		
		int rowIndex = 0;
		while(iterator.hasNext()){
			Country country = iterator.next();
			Row row = sheet.createRow(rowIndex++);
			Cell cell0 = row.createCell(0);
			cell0.setCellValue(country.getName());
			Cell cell1 = row.createCell(1);
			cell1.setCellValue(country.getShortCode());
		}
		
		//lets write the excel data to file now
		FileOutputStream fos = new FileOutputStream(fileName);
		workbook.write(fos);
		fos.close();
		System.out.println(fileName + " written successfully");
	}
	
	public static void writeListToFile(List<String> list) throws Exception{
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Liste");
		
		Iterator<String> iterator = list.iterator();
		
		int rowIndex = 0;
		while(iterator.hasNext()){
			String s = iterator.next();
			
			String[]arr = s.split(";");			
			Row row = sheet.createRow(rowIndex++);
			for(int i=0;i<arr.length;i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(arr[i]);
			}
			
		}
		
		FileOutputStream fos = new FileOutputStream("Test.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Test.xlsx" + " written successfully");
	}
	
	public static void main(String args[]) throws Exception{
		Country c1 = new Country("Turkiye","TR");
		Country c2 = new Country("Ukrayna","UK");
		Country c3 = new Country("Almanya","DE");
		Country c4 = new Country("Irlanda","ICE");
		Country c5 = new Country("IRAN","IR");
		List<Country> list = new ArrayList<Country>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
//		List<Country> list = ReadExcelFileToList.readExcelData("Sample.xlsx");
		WriteListToExcelFile.writeCountryListToFile("Countries.xls", list);
		
		List<String> strList = new ArrayList<String>();
		strList.add("tarik;muraat;islam");
		strList.add("hulya;meva;islam");
		strList.add("islam;muraat;tarik");
		strList.add("tarik;tarik;islam");
		
		double d = 10.63;
		String value = String.valueOf(d);
		strList.add("tarik;"+d+";islam");
		
		WriteListToExcelFile.writeListToFile(strList);
		
	}
}