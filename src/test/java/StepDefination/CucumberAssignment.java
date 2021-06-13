package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class CucumberAssignment {
	WebDriver driver = hooks.driver;
	
	@Given("^User is on elearning application registrationpage$")
	public void user_is_on_elearning_application_registrationpage() throws Exception {
	    
		driver.get("http://elearningm1.upskills.in/");
	    Thread.sleep(3000);
	}

	@Given("^User click on signup button for registration$")
	public void user_click_on_signup_button_for_registration() throws Exception  {
	  
	//WebElement signuplink = driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']"));
	  WebElement signuplink = driver.findElement(By.xpath("//*[contains(text(),'Sign up')]"));
	  signuplink.click();
	  /* Actions a = new Actions(driver);
       a.moveToElement(signuplink).click();*/
       System.out.println("user clicked on signup link");
       Thread.sleep(5000);
	    
	}
	
	@When("^User enter mandatory \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" details$")
	public void user_enter_mandatory_and_and_and_and_and_details(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception  {
	 
		WebElement  fstname =   driver.findElement(By.xpath("//input[@id='registration_firstname']"));
		fstname.click();
		fstname.sendKeys(arg1);
		System.out.println("user eneterd frs tname");
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(arg2);
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg3);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(arg4);
	   driver.findElement(By.xpath("//input[@name='pass1']")).sendKeys(arg5);
	   driver.findElement(By.xpath("//input[@name='pass2']")).sendKeys(arg6);
	   Thread.sleep(3000);
	}

	@When("^User click on regitser button$")
	public void user_click_on_regitser_button()  {
		WebElement registerbutton = driver.findElement(By.id("registration_submit"));
		registerbutton.click();
		System.out.println("user clicked on register button");
	   
	}

	@Then("^User should redirect to elearning homepage$")
	public void user_should_redirect_to_elearning_homepage(){
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		  
	}

	@Then("^User select inbox from user profile$")
	public void user_select_inbox_from_user_profile() throws Exception{
		WebElement profileicon = driver.findElement(By.xpath("//span[@class='caret']"));
		//WebElement profileicon = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/span[2]"));
		profileicon.click();
		System.out.println("user clicked on profile icon");
		Thread.sleep(5000);
		//WebElement inbox = driver.findElement(By.xpath("//a[@title='Inbox']"));
		WebElement inbox = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a"));
		inbox.click();  
		System.out.println("user clicked on inbox");
	}

	@Then("^User click on compose message icon to enter subject line$")
	public void user_click_on_compose_message_icon_to_enter_subject_line(){
	    
	    WebElement composemsgicon = driver.findElement(By.xpath("//img[@title='Compose message']"));
	    composemsgicon.click();
	    
	  
	    WebElement subject = driver.findElement(By.xpath("//input[@class='form-control']"));
	    subject.click();
	    subject.sendKeys("test content");
	}

	@Then("^User click on send message button at the bottom$")
	public void user_click_on_send_message_button_at_the_bottom() throws Throwable {
		WebElement sendmsgbutton = driver.findElement(By.xpath("//button[@class=' btn btn-primary ']"));
		sendmsgbutton.click();
	}


}
