package HomeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPageFuncs extends SearchPageObjects {

	public SearchPageFuncs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void selectDepartingMonth(String departingMonth) {
		try {
			Select drop = new Select(getDepartingDropDown());
			drop.selectByValue(departingMonth);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectReturningMonth(String returningMonth) {
		try {
			Select drop = new Select(getReturningDropDown());
			drop.selectByValue(returningMonth);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickSearchButton() {
		try {

			getSubmitButton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
