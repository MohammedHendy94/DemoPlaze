package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static WebDriver webdriver;
    private static DriverSingleton driverSingleton = null;

    private DriverSingleton(){
        setChromeDriver();
    }
    public static DriverSingleton getDriverSingleton(){
        if(driverSingleton == null)
            driverSingleton = new DriverSingleton();
        return driverSingleton;
    }
    private void setChromeDriver(){
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.navigate().to("https://www.demoblaze.com/");
    }
    public static WebDriver getWebDriver(){
        return webdriver;
    }
    public String getCurrentUrl(){
       return webdriver.getCurrentUrl();
    }

}
