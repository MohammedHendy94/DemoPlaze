package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class ProductPage extends PagesBase {

    private static By cartLinkText = By.linkText("Cart");
    private static By addToCartLinkText = By.linkText("Add to cart");


    public void addProductToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clickButton(addToCartLinkText);
    }

    public CartPage openCart(){
        clickButton(cartLinkText);
        return new CartPage();
    }




}
