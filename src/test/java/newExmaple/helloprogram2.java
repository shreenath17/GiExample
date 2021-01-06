package newExmaple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class helloprogram2 {
	@Parameters({"URL"})
	@Test
	public void running(String param) {
		System.out.println(param);
		String basepath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", basepath+"\\resources\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(param);
		driver.manage().window().maximize();
		driver.quit();
	}

}
