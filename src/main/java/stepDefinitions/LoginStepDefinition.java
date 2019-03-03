package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on main page$")
	public void already_on_main_page(){
		System.out.println("already_on_main_page");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\AmazonBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@When("^title of page is Online shopping site$")
	public void title_of_page_is_Online_shopping_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("title_of_page_is_Online_shopping_site");
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Then("^click on sign in button$")
	public void click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click_on_sign_in_button");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();

	}

	// 2 regular expressions can be used
	// 1. \"(.*)\"  or
	// 2. \"([^\"]*)\"
	
	@Then("^enter \"(.*)\" and click continue$")
	public void enter_username_email_id_and_click_continue(String username) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter_username_email_id_and_click_continue");
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();

	}

	@Then("^enter \"(.*)\" and click login button$")
	public void enter_password_and_click_login_button(String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter_password_and_click_login_button");
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
	}

	@And("^user is on home page$")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_on_home_page");
	//	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).getText().contains("Hello"));
		
	}
	
	@And("^close browser$")
	public void close_browser(){
		driver.close();
	}



}
