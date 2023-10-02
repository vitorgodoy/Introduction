import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_117_0_5938_132.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		
//		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
//				.get(1).getText();
		
		name.sendKeys("Java Course");
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File ("logo2.png"));
		
		
		//get height and whidth
		System.out.println(name.getRect().getDimension().height);
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
