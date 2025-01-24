package webdriverpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Selenium Manager Utility: SM 
		//Open Browser - Chrome
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.naveenautomationlabs.com");
		String title = driver.getTitle();
		
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
