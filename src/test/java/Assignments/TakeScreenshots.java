package Assignments;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshots extends AppTest{
	@Test
	public static void takeScreenshot(String methodName) throws Exception {

		WebDriver driver;
		driver = getDriver();
		String fileLocation= System.getProperty("user.dir")+"//Screenshots//"+methodName+System.currentTimeMillis()+".png";
		screenshotMethod(driver, fileLocation);
	}
	/**
	 * This function will take screenshot
	 * 
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 */
	public static void screenshotMethod(WebDriver webdriver, String fileWithPath) throws Exception {
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile = new File(fileWithPath);
        //Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}