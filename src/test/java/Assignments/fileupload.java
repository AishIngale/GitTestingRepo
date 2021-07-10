package Assignments;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.xpath("//a[text()='File Upload']"))).build().perform();
		Thread.sleep(10000);
		a.click(driver.findElement(By.xpath("//input[@id='file-upload']"))).build().perform();
		Runtime.getRuntime().exec("G:\\\\Selenium2021\\\\ImageUpload.exe");
		Thread.sleep(10000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
		
		Thread.sleep(5000);
		/*
		 * WebElement uploaded=driver.findElement(By.xpath("//div[@class='example']"));
		 * 
		 * FileUtils.copyFile(uploaded.getScreenshotAs(OutputType.FILE), new
		 * File("submit.png")); String nameofCurrMethod = new
		 * Throwable().getStackTrace()[0].getMethodName();
		 * TakeScreenshots.takeScreenshot(nameofCurrMethod);
		 * System.out.println(driver.getPageSource());
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getWindowHandles());
		 */
	}

}
