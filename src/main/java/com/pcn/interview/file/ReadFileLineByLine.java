package com.pcn.interview.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFileLineByLine {
	
	
	public static void main(String[] args){
		
		// Method 1
		try {
			InputStream in = new FileInputStream("runconfig.properties");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		// Method 2
		
		try {
			File file = new File("runconfig.properties");
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while((line = br.readLine()) != null)
				System.out.println(line);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		

		
		
		
		// Method 3
		File file = new File("runconfig.properties");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			
			String line = null;
			while(scanner.hasNextLine()){
				line = scanner.nextLine();
				System.out.println(line);
			
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
			
		
		
		
		
	}
	
	

}
