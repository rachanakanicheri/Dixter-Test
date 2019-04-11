package com.dixter.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("whiteBoxWithLogo"))));
		
	}
	
	public WebElement getUsernameTextbox()
	{
		try
		{
			return(driver.findElement(By.name("username")));
		}
		
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	
	public WebElement getPasswordTextbox()
	{
		try
		{
			return(driver.findElement(By.name("pwd")));
		}
		
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getLoginButton()
	{
		try
		{
			return(driver.findElement(By.xpath("//div[text()='Login ']")));
		}
		
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getKeepmeLoggedInCheckbox()
	{
		try
		{
			return (driver.findElement(By.id("keepLoggedInCheckBox")));
		}
		
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getForgotPasswordLink()
	{
		try
		{
			return(driver.findElement(By.linkText("Forgot your password?")));
		}
		
		catch(NoSuchElementException e)
		{
			return null;
		}
	}


}
