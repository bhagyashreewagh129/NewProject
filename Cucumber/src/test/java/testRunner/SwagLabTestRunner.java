package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/featureFiles/SwagLab.feature",
				//stepdefinitionfilepackagename
		glue= "stepDefination",
		dryRun=false,
		plugin={"pretty",
				"html:target/cucumber-reports/swaglabloginhtml.html"}
		//monochrome=true		
		)

public class SwagLabTestRunner extends AbstractTestNGCucumberTests {

}
