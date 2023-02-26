package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PagesBase {


    private static By signUpButton = By.id("signin2");
    private static By signupUsernametxtBox = By.id("sign-username");
    private static By signupPasswordtxtBox = By.id("sign-password");
    private static By form_sign_upButton = By.xpath("//button[@onclick=\"register()\"]");
    private static By loginButton = By.id("login2");
    private static By loginUsernametxtBox = By.id("loginusername");
    private static By loginPasswordtxtBox = By.id("loginpassword");
    private static By form_log_inButton = By.xpath("//button[@onclick=\"logIn()\"]");
    private static By form_closeButton = By.xpath("(//button[@class=\"btn btn-secondary\"])[1]");
    private static By nameofuserLabel = By.id("nameofuser");
    private static By phonesCategoryButton = By.xpath("//a[@onclick=\"byCat('phone')\"]");
    private static By labTopsCategoryButton = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private static By monitorsCategoryButton = By.xpath("//a[@onclick=\"byCat('monitor')\"]");
    private static By phonesElements = By.xpath("//div[@class=\"card-block\"]");
    private static By labtopElements = By.xpath("//div[@class=\"card-block\"]");
    private static By monitorsElements = By.xpath("//div[@class=\"card-block\"]");
    private static By productLinkText = By.linkText("Samsung galaxy s6");


    public void clickSignUp() {
        clickButton(signUpButton);
    }

    public void fillSignupUsernameAndPassword(String username , String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        sendText(signupUsernametxtBox,username);
        sendText(signupPasswordtxtBox,password);
    }

    public void clickOnFormsignup(){
        clickButton(form_sign_upButton);
    }

    public void clickLogin() {
        clickButton(loginButton);
    }

    public void fillLoginUsernameAndPassword(String username , String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        sendText(loginUsernametxtBox, username);
        sendText(loginPasswordtxtBox,password);
    }

    public void clickOnFormLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clickButton(form_log_inButton);
    }

    public String getNameOfUser(){
        return getElementText(nameofuserLabel);
    }

    public void acceptAlertBox(){
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("Alert not displayed!");
        }
    }

    public int getNumberOfPhonesItems(){
        return driver.findElements(phonesElements).size();
    }
    public int getNumberOfMonitorsItems(){
        return driver.findElements(monitorsElements).size();
    }
    public int getNumberOfLabtopsItems(){return driver.findElements(labtopElements).size();}

    public void openMonitorsCatgory(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(monitorsCategoryButton);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(monitorsCategoryButton);
        }
    }

    public void openLabtopsCatgory(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(labTopsCategoryButton);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(labTopsCategoryButton);
        }
    }

    public void openPhonesCatgory(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(phonesCategoryButton);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(phonesCategoryButton);
        }
    }

    public ProductPage openProduct(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(productLinkText);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            clickButton(productLinkText);
        }
        return new ProductPage();
    }



}
