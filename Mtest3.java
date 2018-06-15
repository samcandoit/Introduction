package com.packge.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/sampathweerasinghe/Documents/Software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pncbank.com");
		driver.findElement(By.id("userId")).sendKeys("text");
		
		
	}

}
