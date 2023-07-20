import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;import org.testng.Assert;

public class Reclassificar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Navigate to URL:
		driver.get("https://gtm-amers.onesourcelogin.com/tr-suite-gtm-web/pages/index.jsf");
		// abre o menu:
		driver.findElement(By.xpath("//*[@id=\'j_username\']")).sendKeys("SOPORTE_PROD_WMCENAM");
		driver.findElement(By.xpath("//*[@id=\'j_password\']")).sendKeys("Supportpass1$");
		driver.findElement(By.xpath("//*[@id=\'taxit_btn_login\']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\'taxitSimultaneousLogin:modalSimultaneousLogin::yes_button\']")).click();
		Thread.sleep(10000L);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/aside[2]")).click();
		
		
	}
}