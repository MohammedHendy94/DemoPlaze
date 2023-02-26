package pages;

import org.openqa.selenium.By;

public class CartPage extends PagesBase {

    private static By deleteLinkText = By.linkText("Delete");
    private static By placeOrderButton = By.xpath("//button[@class=\"btn btn-success\"]");
    private static By nameTxtBox = By.id("name");
    private static By credtitCardTxtBox = By.id("card");
    private static By purchaseButton = By.xpath("//button[@onclick=\"purchaseOrder()\"]");
    private static By okCnfirmButton = By.xpath("//button[@class=\"confirm btn btn-lg btn-primary\"]");

    public void deleteProduct(){
        clickButton(deleteLinkText);
    }
    public void clickPlaceOrder(){
        clickButton(placeOrderButton);
    }
    public void fillNameAndCreditCard(String name, String creditcard){
        sendText(nameTxtBox,name);
        sendText(credtitCardTxtBox,creditcard);
    }
    public void clickPurchase(){
        clickButton(purchaseButton);
    }
    public void confirmOrder(){
        clickButton(okCnfirmButton);
    }







}
