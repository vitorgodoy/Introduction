import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//mostrar para o meu driver que eu posso executar um bloco de javascript:
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scrollar a tela:
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=150");
		
		//pegar a tabela
		List<WebElement> quartaColuna = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int result = 0;
		String texto = "";
		
		for (int i = 0; i<quartaColuna.size(); i++) {
			
			
			result = result + Integer.parseInt(quartaColuna.get(i).getText());
			
		}
		
		System.out.println(result);
		
	}

}
