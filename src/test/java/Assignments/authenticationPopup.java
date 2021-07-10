package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.takeScreenshot(nameofCurrMethod);
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
	}

}
