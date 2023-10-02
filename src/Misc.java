import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Misc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximizar a janela
		driver.manage().window().maximize();
		
		//deletar todos os cookies
		driver.manage().deleteAllCookies();
		
		//deletar apenas um cookie específico:
		//driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://www.google.com");
		
		
		//método para falar para o driver tirar um screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C://screenshot.png"));;
		//access is denied? sometimes you cannot write directly on C: Create a folder and save in there
		
	}

}
