package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Assignments.AppTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
@RunWith(Cucumber.class)
public class A1 extends AppTest{
	WebDriver driver;
	Properties prop;	
	
	@Given("amazon.in URL is given")
	public void amazon_in_url_is_given() {
		System.out.println("Opening amazon site");
	    

	}

	@SuppressWarnings("deprecation")
	@When("User clicks on the first menu link and tries to print page title")
	public void user_clicks_on_the_first_menu_link_and_tries_to_print_page_title() {
		driver=getDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String HomePageTitle=driver.getTitle();
	    System.out.println("Main page title= " + HomePageTitle);
	    driver.findElement(By.xpath("//div[contains(@id,'nav-xshop')]//a[contains(text(),'Fashion')]")).click();
	    System.out.println("Amazon Pay page title= " + driver.getTitle());
	    driver.navigate().back();
	    Assert.assertEquals(HomePageTitle, driver.getTitle());
	
	}

	@Then("Page title is printed")
	public void page_title_is_printed() {
	    System.out.println("Page titles are validated");
	    driver.close();
	}

	@Given("techlistic.com URL is given")
	public void techlistic_com_url_is_given() {
		System.out.println("OPening techlistic site");
		 
	    
	    
	}

	@When("User validates all menu links and page titles of techlistic.com")
	public void user_validates_all_menu_links_and_page_titles_of_techlistic_com() {
		driver=getDriver();
		driver.get("https://www.techlistic.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String HomePageTitle=driver.getTitle();
	    System.out.println("Main page title= " + HomePageTitle);
	    driver.findElement(By.xpath("//li[contains(@aria-hidden,'false')]//a[contains(text(),'Java')]")).click();
	    System.out.println("Java page title= " + driver.getTitle());
	    driver.navigate().back();
	    System.out.println("Main page title= " + HomePageTitle);
	    driver.findElement(By.xpath("//li[contains(@aria-hidden,'false')]//a[contains(text(),'TestNG')]")).click();
	    System.out.println("TestNG page title= " + driver.getTitle());
	    driver.navigate().back();
	    Assert.assertEquals(HomePageTitle, driver.getTitle());
	    
	}

	@Then("All page titles are validated")
	public void all_page_titles_are_validated() {
	    
		System.out.println("All Page titles are validated");
		driver.close();
	}

	@When("User validates all menu links and page titles of amazon.com")
	public void user_validates_all_menu_links_and_page_titles_of_amazon_com() {
		driver=getDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String HomePageTitle=driver.getTitle();
	    System.out.println("Main page title= " + HomePageTitle);
	    driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
	    System.out.println("Cutomer service page title= " + driver.getTitle());
	    driver.navigate().back();
	    Assert.assertEquals(HomePageTitle, driver.getTitle());
	    
	}
	
	
}
