import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomerceArrays {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//implict wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));


		// array
		String[] vegetaisClicar = {"Cucumber", "Brocolli" , "Beetroot","Carrot"};
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//chama o metodo de incluir itens
		adicionarItem(driver,vegetaisClicar);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//esperar até o elemento estar visivel
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		//esperar até o elemento do texto seja visivel
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		//pedir
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		//Dropdowns estáticos - selecionar o pais
		Select lista = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")));
		lista.selectByValue("Brazil");
		//Aceitar os temos e confirmar
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/span[1]")).getText());
				
		
	}
	// metodo que clica nos itens e adiciona ao carrinho
	public static void adicionarItem(WebDriver driver, String[] vegetaisClicar) throws InterruptedException {
		
		int j = 0;
		
		Thread.sleep(2000);
		// pega o nome do produto no h4 deles
		List<WebElement> produtos = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i <= produtos.size(); i++) {

			// pega o nome da iteração
			String[] nomeVegetal = produtos.get(i).getText().split("-");
			String nomeFormatado = nomeVegetal[0].trim();
			
			// converter o array para array list
			List<String> vegetaLista = Arrays.asList(vegetaisClicar);
			
			
			if (vegetaLista.contains(nomeFormatado)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(1000);

			}
			if(j==vegetaisClicar.length) {
				break;
			}
		}
		
		
		
	}

}