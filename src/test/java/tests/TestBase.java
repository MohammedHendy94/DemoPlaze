package tests;

import browser.Browser;
import driver.DriverSingleton;
import platform.ProductStore;

public class TestBase {

    protected static DriverSingleton driver;
    protected static Browser browser = new Browser();

    public TestBase (){
        driver = DriverSingleton.getDriverSingleton();
    }
}
