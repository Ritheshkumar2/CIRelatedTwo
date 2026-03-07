package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass extends WebDriverRelated{
	
	@BeforeTest
	public void init() {
		setWebDriver();
		getDriver().get("https://testautomationpractice.blogspot.com/");
		getDriver().manage().window().maximize();
		System.out.println(getDriver().getTitle());
	}
	
	@Test
	public void testo() {
		TestCaseOne.testcaseOne();
	}
	
	@Test
	public void testt() {
		TestCaseTwo.testcaseTwo();
	}
	
	@AfterTest
	public void tearDown() {
		removeDriver();
	}
	

}
