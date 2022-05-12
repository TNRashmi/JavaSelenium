package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rash");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rashu");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
