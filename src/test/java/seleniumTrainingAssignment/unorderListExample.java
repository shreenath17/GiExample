package seleniumTrainingAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class unorderListExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		String [] a = {"ind","us"};
		String [] b = {"India","mauritius"};
		int s = a.length;
		driver = new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement textBox = driver.findElement(By.xpath("//input[@id='searchbox']"));
		for(int i = 0; i < s;i++) {
			textBox.sendKeys(a[i]);
			Thread.sleep(2000);		
			List<WebElement> unorderList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			for(int j = 0;j <unorderList.size();j++) {
				if(unorderList.get(j).getText().equalsIgnoreCase(b[i])) {
					unorderList.get(j).click();
					break;
				}
		}
		}
	}
		

	}


