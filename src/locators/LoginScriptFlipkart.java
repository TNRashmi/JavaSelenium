package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("rashu.tn@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("chinnu@87");
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}

}

