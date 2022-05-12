package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		if(search.isEnabled())
			System.out.println("Pass: Element is enabled");
		else
			System.out.println("Fail: Element is not enabled");
		
		driver.close();

	}

}
