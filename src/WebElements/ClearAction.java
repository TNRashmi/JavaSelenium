package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signin.submit();

	}

}
