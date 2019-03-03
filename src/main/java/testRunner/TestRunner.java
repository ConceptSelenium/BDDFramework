package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Work\\JavaLearningClasses2\\AmazonBDDFramework\\src\\main\\java\\featureFiles\\hooks.feature"
		,glue={"stepDefinitions"} // path to step definitions
		,plugin={"pretty","html:test-output","json:json-output","junit:amazon_report.xml"} // to provide readable format and generation of log
		,monochrome=true // readable output on console
		,dryRun=false // try to map feature file definition with step definition	and reports discrepancies
		//,tags={"~@E2ETest", "~@RegressionTest","~@SmokeTest"}
		)

//OR : {"@E2ETest, @SmokeTest, @RegressionTest"} 
//AND: {"@E2ETest", "@SmokeTest", "@RegressionTest"}
//Ignore test cases : tags={"~@E2ETest"}
public class TestRunner {

}
 