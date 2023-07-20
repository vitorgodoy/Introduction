import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Navigate to URL:
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Click first checkbox:
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		// verify if it is selected
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		Thread.sleep(2000L);
		// Uncheck the checkbox:
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		// verify if its not selected:
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		
		//count the number of checkboxes:
		int numberOfCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("The number of checkboxes in the page is " +numberOfCheckboxes);
	}
}