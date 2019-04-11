package com.dixter.lib.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriver {
	
	public static WebDriver getDriverInstance()
	{
		
		WebDriver driver=null;
		
		String browser=DataHandlers.getDatatoProperties("config", "browser").toLowerCase();
		String url=DataHandlers.getDatatoProperties("config", "test-url");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\browser-servers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\browser-servers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
