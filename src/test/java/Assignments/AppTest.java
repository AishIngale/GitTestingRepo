package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
	public static Properties prop;
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/user/MavenProject/MavenProject.properties");
			 prop.load(fis);
		} catch (FileNotFoundException abc) {
			abc.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
   System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
   driver=new ChromeDriver();
   return driver;
	}
}