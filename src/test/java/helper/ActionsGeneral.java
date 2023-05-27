package helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static stepDef.HookStep.driver;

public class ActionsGeneral {
    public static void click(By selector) {
        driver.findElement(selector).click();
    }

    public static void inputText(By selector, String text) {
        driver.findElement(selector).sendKeys(text);
    }

    public static void verifyDisplayed(By selector) {
        driver.findElement(selector).isDisplayed();
    }

    public static void verifyTextEquals(By selector, String text) {
        String error_msg = driver.findElement(selector).getText();
        assert Objects.equals(error_msg, text);
    }

    public static void scrollToElem(By selector) {
        WebElement element = driver.findElement(selector);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public static void verifyTextDisplayed(String text){
        assertTrue(driver.getPageSource().contains(text));
    }
}
