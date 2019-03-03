package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
//	@Before
//	public void Setup(){
//		System.out.println("Setting up browser");
//	}
//	
//	@After
//	public void tearDown(){
//		System.out.println("closing browser");
//	}
	
	@Before("@First")
	public void SetupFirst(){
		System.out.println("Setting up browser: SetupFirst");
	}
	
	@After("@First")
	public void tearDownFirst(){
		System.out.println("closing browser :tearDownFirst");
	}
	
	
	@Before("@Second")
	public void SetupSecond(){
		System.out.println("Setting up browser: SetupSecond");
	}
	
	@After("@Second")
	public void tearDownSecond(){
		System.out.println("closing browser :tearDownSecond");
	}
	
	
	@Given("^test case one execution step one$")
	public void test_case_one_execution_step_one() throws Throwable {
	    System.out.println("test_case_one_execution_step_one");
	}

	@When("^step two$")
	public void step_two() throws Throwable {

		System.out.println("step_two");
	}

	@Then("^step three$")
	public void step_three() throws Throwable {
		System.out.println("step_three");
	}

	@Given("^test case two execution step one$")
	public void test_case_two_execution_step_one() throws Throwable {
		
		System.out.println("test_case_two_execution_step_one");

	}

	@Given("^test case three execution step one$")
	public void test_case_three_execution_step_one() throws Throwable {
		
		System.out.println("test_case_two_execution_step_one");

		
	}

}
