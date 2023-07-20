import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.openqa.selenium.*;

public class Prank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create driver object for chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		
		
		
		int cem = 100;
		
		while (cem > 0) {
			// maximizar a tela
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver( options );
			
			//full screen
			options.addArguments("--kiosk");
			driver = new ChromeDriver(options);
			
			String url = "http://www.fallingfalling.com/";
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
		  cem--;
		}
		
		
		

	}

}
