package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/featureFiles/TagNewTours.feature",
		glue="stepDefination",
				dryRun=false,
				tags="Register",
				plugin={"pretty",
						"html:target/cucumber-reports/NewToursTagshtml.html",
						"json:target/cucmber-reports/NewToursTagsjson.json"}
				//monochrome=true	
		)

public class TagsNewTourEx extends AbstractTestNGCucumberTests{

}
