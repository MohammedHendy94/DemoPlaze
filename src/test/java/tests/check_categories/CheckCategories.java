package tests.check_categories;


import io.cucumber.java.en.When;
import org.junit.Assert;
import tests.TestBase;

public class CheckCategories extends TestBase {

    @When("click on phones category")
    public void click_on_phones_category() {
        browser.productStore.homePage.openPhonesCatgory();
    }
    @When("check for listed items in phones category")
    public void check_for_listed_items_in_phones_category() {
        Assert.assertNotEquals(0,browser.productStore.homePage.getNumberOfPhonesItems());
        System.out.println(browser.productStore.homePage.getNumberOfPhonesItems());
    }
    @When("click on labtops category")
    public void click_on_labtops_category() {
        browser.productStore.homePage.openLabtopsCatgory();
    }
    @When("check for listed items in labtops category")
    public void check_for_listed_items_in_labtops_category() {
        Assert.assertNotEquals(0,browser.productStore.homePage.getNumberOfLabtopsItems());
        System.out.println(browser.productStore.homePage.getNumberOfLabtopsItems());
    }
    @When("click on monitors category")
    public void click_on_monitors_category() {
        browser.productStore.homePage.openMonitorsCatgory();
    }
    @When("check for listed items in monitors category")
    public void check_for_listed_items_in_monitors_category() {
        Assert.assertNotEquals(0,browser.productStore.homePage.getNumberOfMonitorsItems());
        System.out.println(browser.productStore.homePage.getNumberOfMonitorsItems());
    }


}
