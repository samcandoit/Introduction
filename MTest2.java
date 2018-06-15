package com.packge.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTest2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/sampathweerasinghe/Documents/Software/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://cnn.com" ;
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.close();
		
	
		
	}

}
