import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//xpath Regular Expression Syntx - //tagName[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		boolean selecionado = driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected();
		if(selecionado) {
			System.out.println("Desconto pra senior");
		} else {
			System.out.println("Sem Desconto");	
		}
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
		
}
