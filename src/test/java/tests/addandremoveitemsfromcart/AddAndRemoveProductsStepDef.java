package tests.addandremoveitemsfromcart;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

public class AddAndRemoveProductsStepDef extends TestBase {

    @When("open product")
    public void open_product() {
       browser.productStore.productPage = browser.productStore.homePage.openProduct();
    }
    @When("add product to cart")
    public void add_product_to_cart() {
        browser.productStore.productPage.addProductToCart();
    }
    @When("open cart")
    public void open_cart() {
        browser.productStore.cartPage= browser.productStore.productPage.openCart();
    }
    @Then("delete product from cart")
    public void delete_product_from_cart() {
       browser.productStore.cartPage.deleteProduct();
    }




}
