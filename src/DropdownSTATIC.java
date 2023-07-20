import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSTATIC {

	public static void main(String[] args) throws InterruptedException { //é preciso adicionar esse throws para usar o sleep
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dropdowns estáticos:
		Select lista = new Select(driver
				.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		lista.selectByValue("USD");
		lista.selectByIndex(2);
		lista.selectByVisibleText("INR");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L); //esperar 2 segundos
		for (int i = 1; i<3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
	}
	

}
