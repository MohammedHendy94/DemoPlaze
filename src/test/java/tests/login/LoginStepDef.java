package tests.login;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tests.TestBase;

public class LoginStepDef extends TestBase {

    @Given("user is on home page on url {string}")
    public void user_is_on_home_page(String url) {
       Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @When("click on login button")
    public void click_on_login_button() {
        browser.productStore.homePage.clickLogin();
    }
    @When("enter username {string} and password {string}")
    public void enter_username_and_password(String username, String password) {
       browser.productStore.homePage.fillLoginUsernameAndPassword(username,password);
    }
    @When("click login")
    public void click_login() {
       browser.productStore.homePage.clickOnFormLogin();
    }
    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        System.out.println(browser.productStore.homePage.getNameOfUser());
    }
    @When("click on signup button")
    public void click_on_signup_button() {
        browser.productStore.homePage.clickSignUp();
    }
    @When("enter his username {string} and his password {string}")
    public void enter_his_username_and_his_password(String username, String password) {
        browser.productStore.homePage.fillSignupUsernameAndPassword(username,password);
    }
    @When("click sign up")
    public void click_sign_up() {
        browser.productStore.homePage.clickOnFormsignup();
    }

    @When("click okay on alert box")
    public void click_okay_on_alert_box() {
        browser.productStore.homePage.acceptAlertBox();
    }


}
