package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiloginSwaglabStepDefination {
	WebDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	}

	@When("Open the swaglab website with valid url {string}")
	public void open_the_swaglab_website_with_valid_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	}

	@When("^enter the username (.*) enter the password (.*)$")
	public void enter_the_username_standard_user_enter_the_password_secret_sauce(String uname, String pass) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("user-name")).sendKeys(uname);  Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(pass);
	    Thread.sleep(3000);
	}

	@When("click on the login button for validation")
	public void click_on_the_login_button_for_validation() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(3000);
	}

	@Then("user close the swaglab browser")
	public void user_close_the_swaglab_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

//	@When("enter the username problem_user enter the password secret_sauce")
//	public void enter_the_username_problem_user_enter_the_password_secret_sauce(String uname, String pass) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("user-name")).sendKeys(uname);
//	    driver.findElement(By.id("password")).sendKeys(pass);
//	}
//
//	@When("enter the username error_user enter the password secret_sauce")
//	public void enter_the_username_error_user_enter_the_password_secret_sauce(String uname, String pass) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("user-name")).sendKeys(uname);
//	    driver.findElement(By.id("password")).sendKeys(pass);
//	}




}
