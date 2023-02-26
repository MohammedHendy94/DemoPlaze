package browser;

import driver.DriverSingleton;
import org.openqa.selenium.Alert;
import platform.ProductStore;

public class Browser {
    private final DriverSingleton driverSingleton =  DriverSingleton.getDriverSingleton();


    public ProductStore productStore;

    public Browser(){
        productStore = new ProductStore();
    }
}
