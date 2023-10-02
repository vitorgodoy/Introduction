import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraverseSiblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		//WebDriverManager.getInstance(ChromeDriver.class).setup();

		ChromeDriver driver = new ChromeDriver();
		 //syntax - XPATH/following-sibling::tag[index]
		driver.get("http://www.amazon.com/");
		
		// USANDO O PARENT::TAG PARA CHEGAR NO PAI ATRAVEZ DO FILHO:
		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/parent::div")).getAttribute("class"));
		
		//Todays deals
		driver.findElement(By.xpath("//a[contains(text(),\'Today's Deals\')]")).click(); //USAR COM ASPAS DUPLAS, NAO FUNCIONOU COM ASPAS SIMPLES.
		//Todays deals +1
		driver.findElement(By.xpath("//a[contains(text(),\'Today's Deals\')]/following-sibling::a[1]")).click();
		//Todays deals +2
		driver.findElement(By.xpath("//a[contains(text(),\'Today's Deals\')]/following-sibling::a[2]")).click();
		//Todays deals +x3
		driver.findElement(By.xpath("//a[contains(text(),\'Today's Deals\')]/following-sibling::a[3]")).click();
		// USANDO LOCATOR TEXT - sintaxe - //TAGNAME[TEXT()='TEXTO AQUI']
	    driver.findElement(By.xpath("//*[text()='& Orders']")).click();
	    

		
//		driver.get("http://www.qaclickacademy.com/");
//		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Interview Guide')]")).click();
//		//mentorship
//		driver.findElementByXPath("//div[@class='nav-outer clearfix']//a[contains(text(),'Mentorship')]").click();
//		//practice projects
//		driver.findElementByXPath("//div[@class='nav-outer clearfix']//a[contains(text(),'Mentorship')]/following-sibling::li[1]").click();
//		//consulting
//		driver.findElementByXPath("//div[@class='nav-outer clearfix']//a[contains(text(),'Mentorship')]/following-sibling::li[2]").click();
//		//earn
//		driver.findElementByXPath("//div[@class='nav-outer clearfix']//a[contains(text(),'Mentorship')]/following-sibling::li[3]").click();
	    
	    //Xpath for Mentor - (//ul[@class='navigation clearfix']) [1] //li[3]
   		//Xpath for Practice Projects - (//ul[@class='navigation clearfix']) [1] //li[3] /following-sibling::li[1]
   		//Xpath for Consulting - (//ul[@class='navigation clearfix']) [1] //li[3] /following-sibling::li[2]
  		//Xpath for Earn - (//ul[@class='navigation clearfix']) [1] //li[3] /following-sibling::li[3]
		
		
	}

}
