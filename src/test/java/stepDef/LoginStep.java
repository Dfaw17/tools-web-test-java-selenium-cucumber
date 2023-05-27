package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import static stepDef.HookStep.driver;

public class LoginStep {
    LoginPage loginPage;

    public LoginStep(){
        this.loginPage = new LoginPage(driver);
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.goToLoginPage();
    }

    @Given("user input username with {string}")
    public void user_input_username_with(String string) {
        loginPage.inputUsername(string);
    }

    @Given("user input password with {string}")
    public void user_input_password_with(String string) {
        loginPage.inputPwd(string);
    }

    @When("user click login button")
    public void user_click_login_button() {
        loginPage.clickLogin();
    }

    @Then("user in on homepage")
    public void user_in_on_homepage() {
        loginPage.verifyHomePage();
    }

    @Then("user get an error message {string}")
    public void userGetAnErrorMessage(String string) {
        loginPage.verifyTextInScreen(string);
    }
}
