package com.packge.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GitHubTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		


	}

}
