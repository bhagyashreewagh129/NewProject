package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/featureFiles/MultiloginSwagLab.feature",
		glue= "stepDefination",
		dryRun=false,
		plugin={"pretty",
				"html:target/cucumber-reports/swaglabmultiloginhtml.html",
				"json:target/cucmber-reports/swaglabmultiloginjson.json"}
		//monochrome=true		
		
		)

public class MultiLoginTestRunner extends AbstractTestNGCucumberTests{

}
