package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rashu.tn@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chinnu@87");
		
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Facebook – log in or sign up"))
			System.out.println("Pass: Home page is displayed");
		else
			System.out.println("Fail: Home page is not displayed");
		//driver.close();

	}

}
