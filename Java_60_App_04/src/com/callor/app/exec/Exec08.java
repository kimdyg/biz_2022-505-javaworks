package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		
		String fileName="src/com/callor/app/exec/data.txt";
				
		InputStream is = null;
		Scanner scan = null;
		try {
			is= new FileInputStream(fileName);
			scan = new Scanner(is);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
