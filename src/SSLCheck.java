import java.util.HashMap;
import java.util.Map;

import org.openqa.*;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SSLCheck {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		//usando a classe proxy, você define qual é o IPAddress
		proxy.setHttpProxy("ipaddress=4444");
		//depois, você fala pro options que vai usar proxy
		options.setCapability("proxy", proxy);
		
		Map<String,Object> prefs = new HashMap <String, Object>();
		
		//definir diretorio de download
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		//FirefoxOptions options1 = new FirefoxOptions();
		//options1.setAcceptanceInsecureCerts(true);
		
		//EdgeOptions options2 = new EdgeOptions();
		
		options.setAcceptInsecureCerts(true);
				
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		//se não passar o options no argumento do ChromeDriver, nada vai funcionar
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
	}

}
