import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaPopus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Vitor";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:\\rahulshettyacademy.com\\AutomationPractice\\");
		
		
		//enviar nome para o campo
		driver.findElement(By.id("name")).sendKeys(nome);
		//clicar no botão de alerta
		driver.findElement(By.id("alertbtn")).click();
		//pegar o texto do alerta e imprimir
		System.out.println(driver.switchTo().alert().getText());
		// alterar o driver para alerta, para aceitar o alerta
		driver.switchTo().alert().accept();
		
		//clicar no botão de confirmar
		driver.findElement(By.id("confirmbtn")).click();
		//pegar o alerta e imprimir
		System.out.println(driver.switchTo().alert().getText());
		//alterar o driver para alerta e dizer não para o alerta (cancelar)
		driver.switchTo().alert().dismiss();
	}

}
