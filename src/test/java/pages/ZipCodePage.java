package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static helper.ActionsGeneral.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ZipCodePage {
    WebDriver driver;

    By item_1 = By.xpath("(//button[@class = 'btn btn_primary btn_small btn_inventory'])[1]");
    By item_2 = By.xpath("(//button[@class = 'btn btn_primary btn_small btn_inventory'])[2]");
    By iconCart = By.xpath("//*[@class = 'shopping_cart_link']");
    By btnCheckout = By.id("checkout");
    By verifyTitlePage = By.xpath("//*[@class = 'title']");
    By inputFirstName = By.xpath("//*[@class = 'input_error form_input'][@id = 'first-name']");
    By inputLastName = By.xpath("(//*[@class = 'input_error form_input'][@id = 'first-name']/parent::*/following-sibling::*)[1]/child::*");
    By inputZipCode = By.id("postal-code");
    By btnContinue = By.id("continue");
    By btnFinish = By.id("finish");
    By verifySuccessOrder = By.xpath("//*[text () = 'Thank you for your order!']");

    public ZipCodePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        click(item_1);
        click(item_2);
    }

    public void clickIconCart(){
        click(iconCart);
    }

    public void clickBtnCheckout(){
        click(btnCheckout);
    }

    public void verifyCheckoutInformationPage(){
        verifyTextEquals(verifyTitlePage, "Checkout: Your Information");
    }

    public void inputFirstName(String firstname){
        inputText(inputFirstName, firstname);
    }

    public void inputLastName(String lastname){
        inputText(inputLastName, lastname);
    }

    public void inputZipCode(String zipcode){
        inputText(inputZipCode, zipcode);
    }

    public void clickBtnContinue(){
        click(btnContinue);
    }

    public void verifyCheckoutOverviewPage(){
        verifyTextEquals(verifyTitlePage, "Checkout: Overview");
    }

    public void clickBtnFinish() {
        scrollToElem(btnFinish);
        click(btnFinish);
    }

    public void verifyOrderSuccess(){
        verifyDisplayed(verifySuccessOrder);
    }
}
