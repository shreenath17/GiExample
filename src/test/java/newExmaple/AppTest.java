package newExmaple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		String basepath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", basepath+"\\resources\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='nav-line-1-container']"))).build().perform();
			/*
			 * w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//div[@id='nav-al-signin']//span[@class='nav-action-inner']")));
			 * driver.findElement(By.xpath(
			 * "//div[@id='nav-al-signin']//span[@class='nav-action-inner']")).click();
			 * //div[@id='nav-al-signin']//span[@class='nav-action-inner']
			 */
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("shreenath").doubleClick().contextClick().build().perform();
	}
}
