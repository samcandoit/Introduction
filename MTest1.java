package com.packge.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/sampathweerasinghe/Documents/Software/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		System.setProperty("webdriver.chrome.driver","/Users/sampathweerasinghe/Documents/Software/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		WebDriver driver3 = new SafariDriver();
		driver.get("https://www.google.com");
		
		
	}

}
