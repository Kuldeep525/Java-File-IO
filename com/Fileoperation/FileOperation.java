package com.Fileoperation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
	
	public static void main(String[] args) {
		
		FileOperation fileOperation = new FileOperation();
		fileOperation.checkFileExit();
		fileOperation.createEmptyFile();
		fileOperation.delete();
		fileOperation.listAllFilesAndDirectory();
	}

	private void checkFileExit() {
		
		Scanner sc = new Scanner(System.in);
		File directory  = new File("C:\\Users\\admin\\Desktop\\Eclipse data\\EmployeePayroll\\src\\com\\textfiles");
		boolean flag = false;
		System.out.println("Enter the file name");
		String fileName = sc.next() ;
		String[] fileList = directory.list();
	
		for(int i = 0 ; i < fileList.length; i++) {
			String file = fileList[i];
			if(file.equalsIgnoreCase(fileName))
				flag = true;			
		}
		if (flag) {
			System.out.println("File founded");
		}
		else {
			System.out.println("No such file");
		}
		sc.close();	
	}
	

	private void createEmptyFile(){
		
		File file = new File("C:\\Users\\admin\\Desktop\\Eclipse data\\EmployeePayroll\\src\\com\\textfiles\\hello.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created Successfull");
	}
	

	private void delete() {
		
		File file = new File("C:\\Users\\admin\\Desktop\\Eclipse data\\EmployeePayroll\\src\\com\\textfiles\\hello.txt");
		file.delete();
		System.out.println("File Deleted");
	}
	
	private void listAllFilesAndDirectory() {
		
		File folder = new File("C:\\Users\\admin\\Desktop\\Eclipse data\\EmployeePayroll");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) 
				System.out.println("Directory " + listOfFiles[i].getName());
		}
	}
	
	
	
	

}
