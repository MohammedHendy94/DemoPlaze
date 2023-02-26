package pages;

import driver.DriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PagesBase {

    static WebDriver driver = DriverSingleton.getWebDriver();
    WebDriverWait wait;
    Alert alert;

    public void clickButton (By button){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(button).click();
    }

    public void navigateTourl (String url){
        driver.navigate().to(url);
    }

    public void sendText (By element, String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(element).sendKeys(text);
    }

    public String getElementText(By element){
      return   driver.findElement(element).getText();
    }

}
