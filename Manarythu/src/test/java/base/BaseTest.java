package base;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigReader;



public class BaseTest {
	

	    public static WebDriver driver;
	    public static Logger log = Logger.getLogger(BaseTest.class);

	    @BeforeMethod
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        log.info(" Browser lanuch");

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Load URL from config.properties
	        driver.get(ConfigReader.getProperty("url"));
	    }
	   

	    @AfterMethod
	    public void tearDown() {
	         
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	

}
