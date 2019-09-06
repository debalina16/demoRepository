/**
 * 
 */
package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Debalina
 *
 */
public class HeadlessChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Debalina/Downloads/chromedriver_win32/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.crmpro.com/index.html");
	System.out.println(driver.getTitle());
}
}
