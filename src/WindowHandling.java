import java.util.Set;
import java.*;


import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		// instancia a classe set, com o metodo de lidar com janelas "getwindowhandles"
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		//usa o metodo iterator para navegar entre os IDS de janelas [parendID,childID]
		java.util.Iterator<String> it = windows.iterator();
		
		//itera dentro dos ids
		String idJanela = it.next();
		String janelaFilha = it.next();
		
		//vai pra aba nova
		driver.switchTo().window(janelaFilha);
		String email = driver.findElement(By.cssSelector(".im-para.red"))
				.getText()
				.split("at")[1]
						.trim()
						.split(" ")[0];
		
		
		System.out.println(email);
		driver.switchTo().window(idJanela);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		

	}

}
