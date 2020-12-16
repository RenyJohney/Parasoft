package parasoft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.databene.feed4testng.FeedTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest extends FeedTest{
	
	WebDriver driver;
	Properties prop;


	//@Parameters({"browser"})
	@BeforeSuite
	public WebDriver initDriver() {
		
		/*switch(browser){
		case "chrome"  :
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		break;
		case "default" : 
			
		break;	
		}	*/
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;	
	}

	@BeforeTest
	public  void loadPropertiesFile() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("src/main/resources/config.properties"));
		
	}
	
	@AfterTest
	public void Exitdriver() {
		
		//driver.quit();
		//driver.close();
	}
		
	}

