package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("rashu.tn@gmail.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("chinnu@87");
		
		WebElement login=driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]"));
		login.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
			System.out.println("Pass: Login page displayed");
		else
			System.out.println("Fail: Login page not displayed");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		
	}

}
