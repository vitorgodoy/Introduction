import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		//Variavel MOVE receb o elemento de tele
		WebElement account = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
		WebElement pesquisa = driver.findElement(By.id("twotabsearchtextbox"));
		
		//pausa o mouse em cima de um elemento especifico (hover) e clicar com o botão direito (context click)
		a.moveToElement(account).contextClick().build().perform();
		
		//pausa o mouse no campo de pesquisa, segura o shift e envia hello, e depois seleciona a palavra
		a.moveToElement(pesquisa).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//teste
		
		
		
	}

}
