package tests.checkout;

import io.cucumber.java.en.When;
import tests.TestBase;

public class CheckOutStepDef extends TestBase {

    @When("click place order")
    public void click_place_order() {
        browser.productStore.cartPage.clickPlaceOrder();
    }
    @When("fill name {string} and credircard {string}")
    public void fill_name_and_credircard(String name, String credircard) {
        browser.productStore.cartPage.fillNameAndCreditCard(name,credircard);
    }
    @When("click purchase")
    public void click_purchase() {
        browser.productStore.cartPage.clickPurchase();
    }
    @When("click okay")
    public void click_okay() {
        browser.productStore.cartPage.confirmOrder();
    }




}
