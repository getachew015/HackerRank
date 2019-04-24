package com.hackerrank.JavaEightFeatures.Streams;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParallelStreams {
	
	public void parallelStream(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reads Excel File and maps each row to Employee object and performs data operation on each record ");
		ParallelStreams parallelStream = new ParallelStreams();
		parallelStream.readExcelMapToObject();
	}
	
	public List<Employee> readExcelMapToObject(){
		List<Employee> empList = new ArrayList<Employee>();
		try {
			String fileName = System.getProperty("user.dir") + "\\src\\EmpList.xlsx";
			FileInputStream excelFile  = new FileInputStream(new File(fileName));
			Workbook workBook = new XSSFWorkbook(excelFile);
			Sheet sheet1 = workBook.getSheetAt(0);
			Iterator<Row> rowIter = sheet1.iterator();
			while(rowIter.hasNext()){
				Row currentRow = rowIter.next();
				Employee tempEmp = new Employee((int)currentRow.getCell(0).getNumericCellValue(), currentRow.getCell(1).getStringCellValue(), currentRow.getCell(2).getStringCellValue(), (double)currentRow.getCell(3).getNumericCellValue());
				empList.add(tempEmp);
			}
			workBook.close();
			/*
			 A parallel stream splits its elements into multiple chunks, 
			 processing each chunk on a different thread. 
			 By default parallelStream() creates threads equal to the number of processors available.
			 */
			List<Employee> empSalaryRaised = 
			empList.parallelStream().filter(emp -> emp.getSalary() < 90000)
									.sorted((emp1,emp2) -> emp1.getEmpFirstName().compareTo(emp2.getEmpFirstName()))
									.map(emp -> {emp.setSalary(emp.getSalary()+1000); return emp;})
									.collect(Collectors.toList());
			empSalaryRaised.forEach(emp -> System.out.println("Name ... "+emp.getEmpFirstName()+"  Salary .. "+emp.getSalary()));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return empList;
	}
}
