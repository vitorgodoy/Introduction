import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class end2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//go to url
		driver.get("https://www.spicejet.com/");
		
		//clica em one way:
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//clica no primeiro dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// espera 2 segundos
		Thread.sleep(2000L);
		
		//seleciona DELHI
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		//clica no segundo dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// espera 2 segundos
				Thread.sleep(2000L);
				
		// seleciona pune
		driver.findElement(By.xpath("((//a[@value='PNQ'])[2])")).click();
		
		//seleciona a data
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertFalse(false);
			
		} else {
			Assert.assertFalse(false);
		}
		
		//seleciona 2 adultos
		driver.findElement(By.id("divpaxinfo")).click();
		// espera 1 segundos
		Thread.sleep(1000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		// espera 1 segundos
				Thread.sleep(1000L);
		driver.findElement(By.xpath("//option[@value='4']")).click();
		//flaga o checkbox de familia e friends
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//aperta o botão de pesquisar
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
	}

}
