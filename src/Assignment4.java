import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> janelas = driver.getWindowHandles();
		
		//usa o metodo iterator para navegar entre os IDS de janelas [parendID,childID]
				java.util.Iterator<String> it = janelas.iterator();
				
				//itera dentro dos ids
				String idJanela = it.next();
				String janelaFilha = it.next();
		
				//vai pra janela nova
				driver.switchTo().window(janelaFilha);
				
				//print new window
				System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
				
				
				driver.switchTo().window(idJanela);
				
				
				String text = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
				System.out.println(text);
	}
	

}
