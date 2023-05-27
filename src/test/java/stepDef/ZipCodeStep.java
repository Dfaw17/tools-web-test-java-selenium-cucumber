package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ZipCodePage;

import static stepDef.HookStep.driver;

public class ZipCodeStep {

    ZipCodePage zipCodePage;
    public ZipCodeStep(){
        this.zipCodePage = new ZipCodePage(driver);
    }

    @Then("user click add to cart an item")
    public void user_click_add_to_cart_an_item() {
        zipCodePage.addItemToCart();
    }
    @Then("user click the shopping cart icon")
    public void user_click_the_shopping_cart_icon() {
        zipCodePage.clickIconCart();
    }
    @Then("user click on checkout")
    public void user_click_on_checkout() {
        zipCodePage.clickBtnCheckout();
    }
    @Then("user is on checkout your information page")
    public void user_is_on_checkout_your_information_page() {
        zipCodePage.verifyCheckoutInformationPage();
    }

    @And("user input firstName with {string}")
    public void userInputFirstNameWith(String string) {
        zipCodePage.inputFirstName(string);
    }

    @And("user input lastName with {string}")
    public void userInputLastNameWith(String string) {
        zipCodePage.inputLastName(string);
    }

    @And("user input zipcode with {string}")
    public void userInputZipcodeWith(String string) {
        zipCodePage.inputZipCode(string);
    }

    @And("user click on continue")
    public void userClickOnContinue() {
        zipCodePage.clickBtnContinue();
    }

    @Then("user will be redirect to checkout overview page")
    public void userWillBeRedirectToCheckoutOverviewPage() {
        zipCodePage.verifyCheckoutOverviewPage();
    }

    @And("user click on finish")
    public void userClickOnFinish() throws InterruptedException {
        zipCodePage.clickBtnFinish();
    }

    @Then("user in on success order page")
    public void userInOnSuccessOrderPage() {
        zipCodePage.verifyOrderSuccess();
    }
}
