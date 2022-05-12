package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DCSkillrary {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		WebElement search = driver.findElement(By.xpath("//input[@value='go']"));
		search.submit();
		
		driver.findElement(By.linkText("Core Java For Selenium Trainin")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='vp-progress']")).click();
		driver.findElement(By.xpath("//div[@class='chapters']"));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Course']")).click();
		
	}

}
