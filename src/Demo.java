import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create driver object for chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_118_0_5993_70.exe");
		ChromeDriver driver = new ChromeDriver();		
		
		driver.get("https:\\www.youtube.com"); // Hit url on browser
		System.out.println(driver.getTitle()); // get title of page on browser
		System.out.println(driver.getCurrentUrl()); // get url of page on browser
		String youtube = driver.getCurrentUrl(); // get url of page on browser

		//System.out.println(driver.getPageSource());
		driver.get("https:\\www.amazon.com");
		Thread.sleep(2000);
		driver.get(youtube); // voltar pra youtube
		driver.close(); // fechar os browser corrente
		//driver.quit(); // fecha todos os browsers abertos pelo script selenium

	}

}
