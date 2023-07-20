import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

 System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Navigate to URL:

		// entrar no site ok
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000L);
		System.out.println("1 - entrei no site....");
		// entrar AMRITSAR na caixa de FROM
		
		//clicar no from
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		System.out.println("2 - cliquei no from....");
		
		Thread.sleep(1000);
		//clicar no AMRTSAR:
		driver.findElement(By.xpath("//div[text()='ATQ']")).click();
		System.out.println("3 - Selecionei ATQ....");
		
		Thread.sleep(1000);
		//clicar no destino:
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		System.out.println("4 - cliquei no destino....");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[6]")).click();
		System.out.println("...INDO SELECIONAR DATA....");
		
		
		
		// selecionar a data de hoje (04/01/2022)
		//driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		System.out.println("5 cliquei no calendario...");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-picker']")).click();
		System.out.println("6 cliquei dentro do calendário... falta clicar na data...");
		//driver.findElement(By.xpath("((//div[data-testid='undefined-calendar-day-4'])[1])")).click();
		System.out.println("7 cliquei na data...");
		// selecionar dois adultos
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		System.out.println("8 cliquei nos passageiros...");
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		System.out.println("9 selecionei 2 adultos...");

		// selecionar 1 children
		driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
		System.out.println("10 selecionei 1 criança...");
		// clicar em pesquisar
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		System.out.println("Mandei pesquisar!");
		
	
		
		
		// codigo antigo:
//		ChromeDriver driver = new ChromeDriver();
//		// Navigate to URL:
//
//		// entrar no site ok
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//		// entrar AMRITSAR na caixa de FROM
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		
//		// Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
//		// selecionar a data de hoje
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
//
//		// selecionar dois adultos
//		driver.findElement(By.id("divpaxinfo")).click();
//		Select adults = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		adults.selectByIndex(1);
//
//		// selecionar 1 children
//		Thread.sleep(1000);
//		Select children = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
//		children.selectByIndex(1);
//
//		// clicar em pesquisar
//		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//
//		// pegar o error message e printar no output
//		String error = driver.findElement(By.id("view-destination-station")).getText();
//		System.out.println(error);
	}
}