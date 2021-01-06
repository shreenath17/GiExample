package newExmaple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptexecutor {
	@Test
	public void clicking() throws InterruptedException {
		String basepath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", basepath+"\\resources\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    //Next button element
	    WebElement nextBtn = driver.findElement(By.id("identifierNext"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    //code to enter value in the email textbox
	    js.executeScript("document.getElementById('identifierId').value='testemail'");
	    //code to click on next button
	    js.executeScript("arguments[0].click();", nextBtn);
	}

}
