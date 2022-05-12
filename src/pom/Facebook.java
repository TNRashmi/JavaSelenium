package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String user)
	{
		usernametb.sendKeys(user);
	}
	public void password(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	public void login()
	{
		loginbtn.click();
	}
}
