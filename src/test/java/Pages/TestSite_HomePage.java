package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSite_HomePage {
    private static WebElement element = null;
    public static String searchBoxName = "q";



    public static WebElement googleSearchBox(WebDriver driver){
        element = driver.findElement(By.name(searchBoxName));
        return element;
    }
}
