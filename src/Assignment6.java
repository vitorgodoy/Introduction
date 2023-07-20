import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		//clicar no checkbox
		String checkOption = "";
		String dropOption = "";
		String alerta = "";
		WebElement checkbox =  driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		if (checkbox.isEnabled()) {
			checkOption = checkbox.getAttribute("value");
		} else {
			System.out.println("Checkbox was not selected");
			Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
		}
		//clicar no dropdown
		System.out.println(checkOption);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		//clicar onde for option2
		Thread.sleep(2000L);
		WebElement dropdown = driver.findElement(By.xpath("//option[contains(text(),'Option2')]"));
		dropOption = dropdown.getText();
		System.out.println(dropOption);
		
		if( checkOption.equalsIgnoreCase(dropOption) ) {
			driver.findElement(By.xpath("//option[contains(text(),'"+dropOption+"')]")).click();

		} else {
			System.out.println("Checkbox or dropdown was not selected");
			Assert.assertFalse(driver.findElement(By.xpath("//option[contains(text(),'Option2')]")).isDisplayed());
		}
		
		driver.findElement(By.id("name")).sendKeys(dropOption);
		driver.findElement(By.id("alertbtn")).click();
		
		alerta = driver.switchTo().alert().getText();	
		
		
		String[] words = alerta.split("\\W+");
		for(int i =0; i<=words.length; i++) {
			if(words[i].equalsIgnoreCase(dropOption)) {
				System.out.println("The word got in the alert was: "+words[i] +  " The option from the dropdown was :" + dropOption + " The option from the checkbox was :" + checkOption);
			} else if (i == words.length && words[i] != dropOption) {
				System.out.println("Option2 not found in alert");
			}
		}
		
		
	}

}