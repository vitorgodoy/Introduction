import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		//pegar a tabela e jogar em um objeto
		WebElement table = driver.findElement(By.id("product"));
		
		//contar as linhas da table
		System.out.println("Numero de linhas é: "+table.findElements(By.tagName("tr")).size());
		//contar as colunas da table:
		System.out.println("Numero de colunas é: "+table.findElements(By.tagName("tr")) //encontrar as linhas (passo anterior)
														.get(0) //ir a primeira linha
														.findElements(By.tagName("th")).size()); // pegar todas as colunas
		
		//colocar todas as informações de TD em um LIST:
		List<WebElement> segundaLinha = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		//Printar cada uma das colunas
		System.out.println(segundaLinha.get(0).getText());
		System.out.println(segundaLinha.get(1).getText());
		System.out.println(segundaLinha.get(2).getText());
														
			
		}
	}
