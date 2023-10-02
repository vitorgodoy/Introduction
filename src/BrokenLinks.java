import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

		//se não passar o options no argumento do ChromeDriver, nada vai funcionar
		WebDriver driver = new ChromeDriver();

		//broken url.



		//JavaMethos will call URLS and gets the status code.

		//step1 get all urls tiep up to the links using selenium
		// if status code >400 then url is not workking

		//a[href*="soapui"]

		//entra na url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		SoftAssert mole = new SoftAssert();

		List<WebElement> todosLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for(WebElement umLink : todosLinks) {
			umLink.getAttribute("href");


			//pega o link da vez e grava em uma string
			String url = umLink.getAttribute("href");


			//make a call to the url above (url)
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			//pega o resultado do connect e printa ele
			int resposta = conn.getResponseCode();
			//System.out.println(resposta);
			mole.assertTrue(resposta<=400,"The link with text "+umLink.getText()+" is broken with code " +resposta);

		}

		mole.assertAll();
	}





}


