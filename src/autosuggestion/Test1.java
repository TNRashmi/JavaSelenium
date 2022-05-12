package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		element.sendKeys("dres");
		
		Thread.sleep(3000);
		List<WebElement> element1 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(element1.size());
		
		for(WebElement b:element1)
		{
			System.out.println(b.getText());
		}
		driver.close();
		

	}

}
