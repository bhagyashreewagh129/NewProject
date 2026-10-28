package pOMFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabPomFile {

	WebDriver driver;
	public SwagLabPomFile(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void Enterusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void Enterpass(String pass) {
		password.sendKeys(pass);
	}
	
	public void clicklogin() {
		loginbtn.click();
	}
	
}
