import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// traz todos os elementos com este CSS LISTA
		List<WebElement> produtos = driver.findElements(By.cssSelector("h4.product-name"));

		//passa um loop em todos os produtos pegos. Se for CUCUMBER, encontra o elemento e clica.
		for (int i = 0; i <= produtos.size(); i++) {
			String nomeProduto = produtos.get(i).getText();
			if (nomeProduto.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}

		}
	}

}
