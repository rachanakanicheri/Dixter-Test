package com.dixter.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {

	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForForgotPasswordPageToLoad()
	{
		WebDriverWait wait=new WebDriverWait (driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("whiteBoxWithLogo"))));
		
	}
	
	public WebElement getEmailTextbox()
	{
		try
		{
			return (driver.findElement(By.id("forgetPasswordEmailOrUsername")));
			
		}
		
		catch(NoSuchElementException e)
		{
			return null;
			
		}
	}
	
	public WebElement getRequestLoginInfoButton()
	{
		try
		{
			return (driver.findElement(By.xpath("//div[text()='Request Login Info']")));
			
		}
		
		catch(NoSuchElementException e)
		{
			return null;
			
		}
	}
	
	
	public WebElement getpasswordrecoverytext()
	{
		try
		{
			return (driver.findElement(By.xpath("//b[contains(text(),'Password recovery instructions')]")));
					
		}
		
		catch(NoSuchElementException e)
		{
			return null;
			
		}
	}
}
