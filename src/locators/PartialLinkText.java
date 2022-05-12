package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/ ");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.name("email")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
