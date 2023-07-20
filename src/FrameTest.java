import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//entrar no frame (usando frame id)
		//driver.switchTo().frame(0);
		
		
		WebElement iFrame = driver.findElement(By.className("demo-frame"));
		
		//entrar no frame usando web element:
		driver.switchTo().frame(iFrame);		
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		
		System.out.println(driver.findElement(By.id("draggable")).getText());
		
		//saber quantos frames tem na tela:
		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		//sair do iframe para a tela:
		driver.switchTo().defaultContent();
	}

}
