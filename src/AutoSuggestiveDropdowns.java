import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("an");
		Thread.sleep(3000L);
		// o objeto LIST joga todos os elementos encontrados no objeto OPCOES do tipo WEBELEMENT
		List <WebElement> opcoes = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//procura na lista toda de opcoes, quando encontrar o desejado, clica.
		for (WebElement opcao :opcoes) {
			if(opcao.getText().equalsIgnoreCase("Kyrgyzstan")) {
				opcao.click();
				break;
			}
			
		}
		
		

	}

}
