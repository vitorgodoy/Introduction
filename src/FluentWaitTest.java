import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//String texto;
		
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		// fluent wait:
		// dentro do fluent, quero um timeout de 30 segundos
		// fazendo um polling de cada 3 segundos
		// ignorando se o elemento não existir.
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement foo = fluent.until(new Function<WebDriver, WebElement>(){
			
			//metodo publico apply para retornar o webelement que quero printar
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed()) {
					return driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
				} else {
					System.out.println("Esperando texto...");
				}
				return null;
				
			}
			
		});
				
		System.out.println("Texto Encontrado: " + driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());
		
	}

}
