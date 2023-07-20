import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild_Relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https:\\www.google.com");
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='sbtc']/div/div[2]/input")).sendKeys("Girafa Filhote");
		driver.findElement(By.xpath("//div[@id='sbtc']/button")).click();
		

	}

}
