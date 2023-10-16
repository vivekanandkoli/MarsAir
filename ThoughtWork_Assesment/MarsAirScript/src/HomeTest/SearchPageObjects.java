package HomeTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageObjects extends BaseClass {

	public SearchPageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "departing")
	private WebElement departingDropDown;

	@FindBy(id = "returning")
	private WebElement returningDropDown;

	@FindBy(id = "promotional_code")
	private WebElement promotionalCode;

	@FindBy(id = "submit")
	private WebElement submitButton;
	
	@FindBy(id = "content")
	private WebElement searchResultContent;
	
	@FindBy(xpath = "//a[text()=' Back']")
	private WebElement backButton;
	
	@FindBy(xpath = "//a[contains(text(),'MarsAir')]")
	private WebElement marsAirLogo;

	public WebElement getDepartingDropDown() {
		return departingDropDown;
	}

	public WebElement getReturningDropDown() {
		return returningDropDown;
	}

	public WebElement getPromotionalCode() {
		return promotionalCode;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public WebElement getBackButton() {
		return backButton;
	}
	
	public WebElement getSearchResultContent() {
		return searchResultContent;
	}
	
	public WebElement getMarsAirLogo() {
		return marsAirLogo;
	}
	
	

}
