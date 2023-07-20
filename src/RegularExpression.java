import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:\\login.salesforce.com\\");
		//CSS Regular Expression Syntax - tagName[Attribute*='value']
		driver.findElement(By.cssSelector("a[id*='forgot'")).click();
		//xpath Regular Expression Syntx - //tagName[contains(@attribute,'value')]
		driver.findElement(By.xpath("//a[contains(@id,'video')]")).click();
		
		driver.get("https:\\amazon.com");
		driver.findElement(By.xpath("//a[contains(@id,'accountList')]")).click();
		driver.findElement(By.cssSelector("a[class*='expander']")).click();
		driver.findElement(By.xpath("//a[contains(@id,'auth-fpp')]")).click();
		WebElement dropdown = driver.findElement(By.cssSelector("input[id*='email']"));
		dropdown.sendKeys(Keys.DOWN, Keys.RETURN);
		

		
			
	}

}
