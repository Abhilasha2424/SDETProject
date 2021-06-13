package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class google {
	
	WebDriver driver = hooks.driver; 
	@Given("^User is on google homepage$")
	public void user_is_on_google_homepage() throws Throwable {
	  
	  driver.get("https://www.google.com/");
	
	}

	@When("^User search with \"([^\"]*)\" keyword$")
	public void user_search_with_keyword(String arg1) throws Throwable {
	WebElement searchbox = 	driver.findElement(By.xpath("//input[@title='Search']"));
		searchbox.sendKeys("java");
		searchbox.click();
		
	    
	}

	@Then("^User should display with java results$")
	public void user_should_display_with_java_results() throws Throwable {
	   WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search']"));
	   
	   searchbox.sendKeys(Keys.ENTER);
		
	}

}
