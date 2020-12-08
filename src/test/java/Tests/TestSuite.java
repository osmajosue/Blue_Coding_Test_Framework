package Tests;

import Utils.Helpers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.util.concurrent.TimeUnit;


public class TestSuite {
    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty(Helpers.SETUP_DRIVER, Helpers.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Helpers.TEST_URL);
    }

    @Test
    public void go_to_test_site(){
        Pages.TestSite_HomePage.googleSearchBox(driver).sendKeys(Helpers.TEST_STRING);
    }

    @After
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.quit();
    }
}
