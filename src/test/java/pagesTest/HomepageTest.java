package pagesTest;

import org.testng.annotations.Test;

import baseutil.BaseClass;
import pages.HomePage;

public class HomepageTest extends BaseClass {

	@Test
	public void clickLogoTest() {
		homePage.clickLogo();
	}

}
