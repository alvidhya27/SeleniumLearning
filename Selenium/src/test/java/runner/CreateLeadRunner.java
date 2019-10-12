package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/features/Login.feature",glue="Implementation", monochrome=true)
public class CreateLeadRunner extends AbstractTestNGCucumberTests {
	

}
