package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsNewTourEx {
	
	WebDriver  driver=new ChromeDriver();
	
	
	@When("enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("test123");
	}

	@When("click on the sign on button")
	public void click_on_the_sign_on_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("submit")).click();
	}

	@Then("user loged in successfully")
	public void user_loged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User logged in successfully");
	}

	@When("user click on Register")
	public void user_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("fill all the information")
	public void fill_all_the_information() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("firstName")).sendKeys("abcd");
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

	@When("user click on Flights")
	public void user_click_on_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Flights")).click();
	}

	@When("fill all details")
	public void fill_all_details() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@name=\"tripType\"][1]")).click();
	}






}
