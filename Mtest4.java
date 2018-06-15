package com.packge.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mtest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/sampathweerasinghe/Documents/Software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.bankofamerica.com/");
		driver.findElement(By.xpath("//*[@id=\"open\"]")).click();
		driver.findElement(By.xpath("//*[contains(@class='btn btn-default btn-cta')")).click();
		driver.findElement(By.xpath("//*[@id=\"CoreCheck_OpenNow_PSLPTestV1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"zipCodeModalInputField\"]")).sendKeys("48104");
		
	}

}
