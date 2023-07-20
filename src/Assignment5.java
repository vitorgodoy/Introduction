import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
	    System.out.println(driver.findElement(By.id("content")).getText());






	    }



	    


	}
	


