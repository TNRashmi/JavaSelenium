package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		WebElement plusbtn = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		a.doubleClick(plusbtn).perform();

	}

}
