package Assignments;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		String downloadPath=System.getProperty("user.dir");
		HashMap<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.xpath("//a[text()='File Download']"))).build().perform();
		a.click(driver.findElement(By.xpath("//a[text()='pb.png']"))).build().perform();
		Thread.sleep(5000);
		File f=new File(downloadPath+"/pb.png");
		if(f.exists()) {
			System.out.println("File is downloaded at the correct location.");
			f.delete();
		}else {
			System.out.println("File is not there.");
		}
	}

}
