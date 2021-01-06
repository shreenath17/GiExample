package newExmaple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependsExample {
	WebDriver driver = null;
	@Test(dependsOnMethods = { "running" })
	@Parameters("site")
	public void exampleRunning(String sites) {
		driver.get(sites);
		Reporter.log("Launching browser");
	}
	@Test
	public void running() {
		WebDriverManager.chromedriver().setup();
		driver = null;
		driver = new ChromeDriver();
		Reporter.log("Opening chrome");
		//driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
	}
	@Test
  public void ViewAcdetailsc() {
      System.out.println("View Your cerif");
  }
//	@Test
//    public void ViewAcc() {
//        System.out.println("View Your Dashboardd");
//    }
// 
    @Test
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }
// 
    @Test(enabled=false)
    public void LogIn() {
        System.out.println("Login Into The Account");
    }
   @Test
    public void zLogIn() {
        System.out.println("Login Into The Account");
    }

}
