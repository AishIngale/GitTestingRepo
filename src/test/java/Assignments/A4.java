package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("q")).sendKeys("green"); 
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbct")));
	   
	    List<WebElement> list = driver.findElements(By.className("sbct"));
	    
	    // Iterate over suggestions box and print suggestions one by one
		/*
		 * for (WebElement e:list) { System.out.println(e.getText());
		 * System.out.println("End"); }
		 */
	    for(int i=0;i<list.size();i++) {
	    	System.out.print(list.get(i).getText());
	    }
	    Actions a=new Actions(driver);
	    WebElement input =driver.findElement(By.name("q"));
	    input.clear();
	    a.keyDown(input, Keys.SHIFT).sendKeys("AISH").keyUp(Keys.SHIFT).build().perform(); 
	    a.keyDown(Keys.chord(Keys.CONTROL,"a")).build().perform();

	}

}
