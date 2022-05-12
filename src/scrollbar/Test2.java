package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement ele = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[16]"));
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Toys & Games']"));
		Point loc = ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		ele.click();
		
		driver.close();

	}

}
