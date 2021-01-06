package seleniumTrainingAssignment;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotScreenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = null;
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://the-internet.herokuapp.com/javascript_alerts");	
	driver.findElement(By.xpath("//button[contains(text(),'JS Alert')]")).click();
	Thread.sleep(2000);
	robotScreenshot.CaptureScreenShotWithTestStepNameUsingRobotClass("URL Loading");	
	//robotScreenshot.takeDriverscreenshot(driver);
	
	Thread.sleep(2000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	}
public static String CaptureScreenShotWithTestStepNameUsingRobotClass(String testStepsName)
{
	try{
		Robot r = new Robot();
		// Get screen size
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// Capturing screenshot by providing size
        BufferedImage tmp = r.createScreenCapture(screenSize); 
        // Defining destination file path
        String path=System.getProperty("user.dir")+"\\resources\\"+testStepsName+".png";
        // To copy temp image in to permanent file
        ImageIO.write(tmp, "png",new File(path)); 
        return path;
        
	}catch(Exception e)
	{
		System.out.println("Some exception occured." + e.getMessage());
		return "";
	}
}
public static void takeDriverscreenshot(WebDriver driver) throws IOException {
	TakesScreenshot t = (TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	String dest = System.getProperty("user.dir")+"\\resources\\image.png";
	FileUtils.copyFile(src, new File(dest));
	
}

}
