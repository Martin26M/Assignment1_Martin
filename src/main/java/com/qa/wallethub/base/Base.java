package com.qa.wallethub.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public Base() throws IOException 
	
	{
	
		prop =new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\wallethub\\config\\data.properties");
	
	prop.load(fis);
	
	
	}
	
	
	public void Initialize() {
		
		{
			   String BrowserName = 	prop.getProperty("browser");
				
				if(BrowserName.equalsIgnoreCase("Chrome"))
					
				{
					
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
					  driver = new ChromeDriver();
					
					
				}
				
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	}}
	
	
	

