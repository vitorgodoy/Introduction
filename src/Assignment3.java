import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		String texto;
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		//WebDriverWait w = new WebDriverWait(driver, 5);
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		
		texto = driver.findElement(By.xpath("//div[@id='results']")).getText();
		
		System.out.println(texto);
		
	}

}
