package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.TestBase;
public class TestCase extends TestBase {
	
	
	
	
	
	
	public class ExampleTest extends TestBase {

	    @BeforeMethod
	    @Parameters("browser")
	    public void setUpTest(String browser) {
	        setUp(browser);
	    }

	    @Test
	    public void exampleTestCase() {
	        driver.get("https://example.com");
	        WebElement exampleElement = driver.findElement(By.id("exampleId"));
	        exampleElement.click();

	        // Perform additional test steps and assertions
	        // ...

	        // Example assertion
	        Assert.assertTrue(true, "Assertion message");
	    }


		
		}
	}



