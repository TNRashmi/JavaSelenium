package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step1:typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step2:access the method and store it in ram
		File ram=ts.getScreenshotAs(OutputType.FILE);
		
		//Step3:specify the location
		File dest= new File("./photo/amazon.png");
		
		//Step4:copy paste from ram to dest location
		FileUtils.copyFile(ram, dest);
		
		driver.close();

	}

}
