

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		//clica no calendario
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	
		//enquanto o mes não for AGOSTO, clica na setinha de proximo
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
				
		
		//31 de agosto
		List<WebElement> datas = driver.findElements(By.cssSelector(".day"));
		
		int count = driver.findElements(By.cssSelector(".day")).size();
		
		//itera sobre a lista de datas, pegando seu conteúdo
		for(int i = 0; i<count; i++) {
			String conteudo = driver.findElements(By.cssSelector(".day")).get(i).getText();
			//quando o conteudo for a data desejada, clica
			if(conteudo.equalsIgnoreCase("31"))  {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
	}

}
