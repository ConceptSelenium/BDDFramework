package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegistrationDataTableMapStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on Main Amazon Page$")
	public void already_on_main_page(){
		System.out.println("already_on_main_page");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\JavaLearningClasses2\\AmazonBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@When("^title of Page is Online Shopping Site$")
	public void title_of_page_is_Online_shopping_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("title_of_page_is_Online_shopping_site");
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Then("^click on Signin Button link$")
	public void click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click_on_sign_in_button");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();

	}

	@Then("^click on the AmazonCreateAccount Button link$")
	public void click_on_the_AmazonCreateAccount_button() throws Throwable {

		driver.findElement(By.id("createAccountSubmit")).click();
	}

	@Then("^user enters username,phone,email,password and press continue Button link$")
	public void user_enters_and_press_continue_button(DataTable regData) throws Throwable {
		//List<List<String>> data = regData.raw();
		//Map<String,String> data = (Map<String, String>) regData.asMaps(String.class, String.class);
		
		for(Map<String,String> data:regData.asMaps(String.class, String.class)) {
				
		System.out.println(data.get("username"));
		
		//Clear existing field value
		driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_phone_number")).clear();
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_password")).clear();
		
					
		driver.findElement(By.id("ap_customer_name")).sendKeys(data.get("username"));
		driver.findElement(By.id("ap_phone_number")).sendKeys(data.get("phone"));
		driver.findElement(By.id("ap_email")).sendKeys(data.get("email"));
		driver.findElement(By.id("ap_password")).sendKeys(data.get("password"));
		
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		}
		
	}

	@Then("^quit the Browser$")
	public void close_the_browser() throws Throwable {

		driver.close();
		
	}

}
