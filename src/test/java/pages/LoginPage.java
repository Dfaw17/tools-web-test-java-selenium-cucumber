package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helper.ActionsGeneral.*;

public class LoginPage {
    WebDriver driver;

    By inputUsername = By.id("user-name");
    By inputPws = By.id("password");
    By buttonLogin = By.id("login-button");
    By verifyHomePage = By.id("shopping_cart_container");

    By verifyErrorLogin = By.xpath("//h3[@data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        inputText(inputUsername, username);
    }

    public void inputPwd(String pwd) {
        inputText(inputPws, pwd);
    }

    public void clickLogin() {
        click(buttonLogin);
    }

    public void verifyHomePage() {
        verifyDisplayed(verifyHomePage);
    }

    public void verifyTextInScreen(String errormsg) {
        verifyTextDisplayed(errormsg);
    }
}
