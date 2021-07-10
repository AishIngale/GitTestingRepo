package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class insecureCertsAndSSL {

	public static void main(String[] args) {
		DesiredCapabilities d=new DesiredCapabilities();
		d.acceptInsecureCerts();
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions CO=new ChromeOptions();
		CO.merge(d);
		WebDriver driver=new ChromeDriver(CO);
		driver.manage().deleteAllCookies();
	}

}
