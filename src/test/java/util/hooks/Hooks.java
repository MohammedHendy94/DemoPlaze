package util.hooks;

import driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.TestBase;

public class Hooks extends TestBase {


    @Before
    public static void intiatDriver(){
        driver= DriverSingleton.getDriverSingleton();
        driver.navigateTo();
    }

    @After
    public void teardown(){
        Runtime.getRuntime().addShutdownHook(new Thread(DriverSingleton::closeDriver));
    }
}
