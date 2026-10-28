package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabStepDefination {
	WebDriver driver;
	@Given("user should be open browser")
	public void user_should_be_open_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	}

	@When("open the swaglab website {string}")
	public void open_the_swaglab_website(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	}

	@When("enter the username {string} enter the password {string}")
	public void enter_the_username_enter_the_password(String uname, String pass) {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("user-name")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("login-button")).click();
	}

	
	@Then("verify the title of swaglab website")
	public void verify_the_title_of_swaglab_website() {
	    // Write code here that turns the phrase above into concrete actions
	    String actTitle=driver.getTitle();
	    String ExpTitle="Swag Labs";
	    
	    Assert.assertEquals(actTitle, ExpTitle);
	    }

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
	

}
