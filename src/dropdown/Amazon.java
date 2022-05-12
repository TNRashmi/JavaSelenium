package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select s=new Select(dropdown);
	
	s.selectByIndex(6);
	Thread.sleep(3000);
	s.selectByValue("search-alias=computers-intl-ship");
	Thread.sleep(3000);
	s.selectByVisibleText("Digital Music");
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	
	for(WebElement ref:alloptions)
	{
		System.out.println(ref.getText());
	}

	driver.close();

	}

}
