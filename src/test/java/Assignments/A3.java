package Assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A3 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//select[@id='continents']"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		s.selectByVisibleText("North America");
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		s1.selectByValue("Wait Commands");
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.xpath("//*[@id=\"photo\"]"))).build().perform();
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("G:\\Selenium2021\\ImageUpload.exe");
	}

}
