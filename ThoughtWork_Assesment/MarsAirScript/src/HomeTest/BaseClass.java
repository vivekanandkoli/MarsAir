package HomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	SearchPageFuncs searchPageFuncs;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://marsair.recruiting.thoughtworks.net/vivekanandkoli");
		
		searchPageFuncs = new SearchPageFuncs(driver);
		
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
