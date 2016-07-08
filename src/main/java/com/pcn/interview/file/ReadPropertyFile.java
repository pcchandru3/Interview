package com.pcn.interview.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;


public class ReadPropertyFile {
	
	public static void main(String[] args){
		
		Properties prop = new Properties();
		
		InputStream file;
		
		try {
			file = new FileInputStream("runconfig.properties");
			prop.load (file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
