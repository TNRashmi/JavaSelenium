package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get(" https://www.google.com/");
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();

	}

}
