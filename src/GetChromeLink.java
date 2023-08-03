import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.openqa.selenium.*;

public class GetChromeLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximizar a tela
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver( options );
		

		//ir ao google
		driver.get("https:\\www.google.com.br");
		// encontrar a caixa de busca e enviar texto
		WebElement q = driver.findElement(By.name("q"));
		q.sendKeys("Aneis de Noivado");
		q.submit();
		
		// encontrar o resultado que eu quero
		driver.findElement(By.partialLinkText("reis")).click();
		//driver.findElement(By.partialLinkText("Vivara")).click();

	}

	
}