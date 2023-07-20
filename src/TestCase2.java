import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create driver object for chrome browser
		
		System.setProperty("webdriver.ie.driver", "C:\\WebDrivers\\IEDriverServer.exe");
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();		
		
		ieDriver.get("https:\\www.youtube.com");
		System.out.println(ieDriver.getTitle());

	}

}
	