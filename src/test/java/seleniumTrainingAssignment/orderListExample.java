package seleniumTrainingAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orderListExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Serialize')]")).click();;
		List<WebElement> unorderList = driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		Actions a  =new Actions(driver);
		int size = unorderList.size();
		
			a.keyDown(Keys.CONTROL).build().perform();	
				unorderList.get(2).click();
				unorderList.get(4).click();
				unorderList.get(5).click();			
		
		a.keyUp(Keys.CONTROL).build().perform();;
		

	}

}
