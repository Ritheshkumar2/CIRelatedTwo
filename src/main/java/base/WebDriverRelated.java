package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverRelated {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setWebDriver() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		driver.set(new ChromeDriver(option));
	}
	
	public WebDriver getDriver() {
		return driver.get();
		
	}
	
	
	public void removeDriver() {
		if(driver.get() != null){
			driver.get().quit();
		}
		driver.remove();
	}

}
