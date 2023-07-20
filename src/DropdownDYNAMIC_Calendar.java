import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDYNAMIC_Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// seleciona o dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// espera 2 segundos
		Thread.sleep(2000L);

		// seleciona DELHI
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		

		// seleciona o segundo dropdown:
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		// espera 2 segundos
		Thread.sleep(2000L);

		// seleciona Pune - (//tagName[@attribute='value'])[index]
		// Como existem 2 nós com o value PNQ na tela, é preciso usar o index 2 para
		// pegar o segundo nó.
		driver.findElement(By.xpath("((//a[@value='PNQ'])[2])")).click();

		// espera 2 segundos
		Thread.sleep(2000L);

		// seleciona a data atual (em destaque - highlight)
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// IMPORTANTE:
		// Caso o codigo não possa levar index como o exemplo acima, uma alternativa é
		// usar o locator PAI:
		// Escrever o xpath para o pai, depois inserir UM espaço e inserir o XPATH que
		// precisa:
		// xpath_parent xpath_child - > Separado por um espaço

	}

}
