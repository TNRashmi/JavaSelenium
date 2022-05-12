package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		
		s.selectByIndex(1);
		//Thread.sleep(3000);
		s.selectByValue("199");
		//Thread.sleep(3000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		s.deselectByIndex(1);
		
		s.deselectByValue("199");
		
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		driver.close();
		
		
		

	}

}
