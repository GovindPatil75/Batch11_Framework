package com.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element,String value,String fieldname) {
		try {
		    element.sendKeys(value);
		    test.log(Status.PASS, fieldname+"=Value successfully send ="+value);
		    
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

	public static void custom_Click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "clicked succefully...="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	public static void custom_HandleDropDown(WebElement element,String text) {
		try {
		  Select select=new Select(element);
		  select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void customMouseMovement(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void custom_Getcapture(WebDriver driver) throws IOException {
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String rm=RandomString.make(5);
		File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_11_Framework\\ScreenShot\\"+rm+".png");
		FileUtils.copyFile(src, destn);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Alert custom_HandleAlert(WebDriver driver) {
		
		Alert alt=driver.switchTo().alert();
		return alt;
	}
	
	
	
	
	
	
	
}
