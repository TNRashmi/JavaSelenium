package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement user = driver.findElement(By.id("email"));
		Point p = user.getLocation();
		System.out.println(p.getX()+"x-ais coordinates");
		System.out.println(p.getY()+"y-ais coordinates");
		
		driver.close();

	}

}
