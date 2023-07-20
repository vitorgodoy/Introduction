import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		//pegar links do site todo
		System.out.println("Total de links da pagina = " +driver.findElements(By.tagName("a")).size());
		
		//pegar links apenas do footer
		WebElement rodape = driver.findElement(By.id("gf-BIG"));
		System.out.println("Total de links do rodapé = " +rodape.findElements(By.tagName("a")).size());
		
		
		//pegar links apenas de uma coluna do footer
		WebElement coluna = rodape.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Total de links da primeira coluna do rodapé = " +coluna.findElements(By.tagName("a")).size());
		
		Actions a = new Actions(driver);
		
		//clicar em todos os link da coluna
		for (int i = 1; i<coluna.findElements(By.tagName("a")).size(); i++) {
			
			String clicarLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coluna.findElements(By.tagName("a")).get(i).sendKeys(clicarLink);
			Thread.sleep(3000L);
			
		}
		
		Set<String> windows = driver.getWindowHandles();
		
		java.util.Iterator<String> it = windows.iterator();
		
		
		/*
		//itera dentro dos ids
		String idJanela = it.next();
		String janelaFilha1 = it.next();
		String janelaFilha2 = it.next();
		String janelaFilha3 = it.next();
		String janelaFilha4 = it.next();
		
		//vai pra aba nova
		driver.switchTo().window(janelaFilha1);
		String titulo = driver.getTitle();
		System.out.println("T1 = "+titulo);
		//vai pra aba nova
		driver.switchTo().window(janelaFilha2);
		String titulo2 = driver.getTitle();
		System.out.println("T2 = "+titulo2);
		//vai pra aba nova
		driver.switchTo().window(janelaFilha3);
		String titulo3 = driver.getTitle();
		System.out.println("T3 = "+titulo3);
		//vai pra aba nova
		driver.switchTo().window(janelaFilha4);
		String titulo4 = driver.getTitle();
		System.out.println("T3 = "+titulo4);
		*/
		
		while(it.hasNext()){
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
	}

}
