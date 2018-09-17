package JenkinsGitMaven.JenkinsGitMavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\JenkinsGitMavenTest\\drivers\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test
    public void test() 
    {
    	
        String Url = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(Url);

        actualTitle = driver.getTitle();
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }
        
        @AfterTest
        public void tearDown()
        {
        driver.close();
        }

    }

