package com.pcn.interview.appium;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidTests {
	
	
	public static void main(String[] args){
		
		AndroidDriver driver = null;
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus_5_API_23_X86");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.DialtactsContactsEntryActivity");
		
		
		
		try {
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.quit();
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
