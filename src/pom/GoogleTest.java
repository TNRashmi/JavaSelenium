package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//WebElement ele = driver.findElement(By.name("q"));
		Google g=new Google(driver);
		driver.navigate().refresh();
		//ele.sendKeys("phone");
		g.searchtextbox("phone");
	}

}
