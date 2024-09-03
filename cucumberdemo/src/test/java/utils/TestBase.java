package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	protected static WebDriver driver;

	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	}

	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
