package com.Vtiger.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
	WebElement sellers = driver.findElement(By.xpath("//h2[text()='Top Selection']"));
	
	Point p=sellers.getLocation();
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+p);
	
	
	}

}
