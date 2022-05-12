package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement dropdown = driver.findElement(By.id("month"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("6");
		Thread.sleep(3000);
		s.selectByVisibleText("Mar");
		
		System.out.println(s.isMultiple());
		
		List<WebElement> alloptions = s.getOptions();
		ArrayList original = new ArrayList();
		
		System.out.println(alloptions.size());
		System.out.println("Before sorting");
		for(WebElement b:alloptions)
		{
			String text=b.getText();
			System.out.println(text);
			original.add(text);
		}
		Collections.sort(original);
		System.out.println("After alphabetical sort");
		System.out.println(original);
		}
			
	}




