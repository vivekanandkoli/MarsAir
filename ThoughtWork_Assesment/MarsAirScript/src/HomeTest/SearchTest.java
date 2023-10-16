package HomeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseClass {

	@Test(priority = 1)
	public void validSearchParameters() throws Exception {

		searchPageFuncs.selectDepartingMonth("July");
		searchPageFuncs.selectReturningMonth("December (two years from now)");
		searchPageFuncs.clickSearchButton();
		

	}
	
	@Test(priority = 2)
	public void careerPlacesValidation() throws Exception {

		
	}
}
