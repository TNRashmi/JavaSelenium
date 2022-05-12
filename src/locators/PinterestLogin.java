package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PinterestLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pinterest.com/");
		
		driver.findElement(By.xpath("(//div[contains(text(), 'Log in')])[1]")).click();
		
		driver.findElement(By.name("id")).sendKeys("rashu.tn@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("rash");
		
		driver.findElement(By.xpath("(//div[contains(text(), 'Log in')])[2]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Pinterest"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
 
		driver.close();
	}

}
