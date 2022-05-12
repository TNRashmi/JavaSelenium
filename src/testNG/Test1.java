package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void demo() {
		Reporter.log("Hello", true);
		Reporter.log("Hello Selenium",false);
		
	}
	

}
