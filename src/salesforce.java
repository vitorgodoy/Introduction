import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import org.openqa.selenium.*;

public class salesforce {

	public static void main(String[] args) {

		//Criar o objeto DRIVER para o DRIVER do CHROME:
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
						
		//ir ao salesforce
		driver.get("https:\\login.salesforce.com\\");
		//achar o login via XPATH e inserir o login
		//driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("meulogin");
		//encontrar a caixa de senha e inserir a senha:
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("minhasenha");
		//clicar no botao de login:
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//pegar o texto e imprimir:
		driver.findElement(By.xpath("//a[@id='signup_link']")).click();
		String error = driver.findElement(By.cssSelector("div#error.loginError")).getText();
	    System.out.println(error);
	
		
		
		
		
	}
	
	
	

}
