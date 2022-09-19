package my.store.qa.pages;

import my.store.qa.executors.BrowserExecutor;
import my.store.qa.executors.MultiBrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class BasePage {

    protected BrowserExecutor getBrowserExecutor() {

        return MultiBrowserManager.getBrowserExecutor();
    }

    //================================================================================
    // Interact with page
    //================================================================================

    protected void open(String url) {

        getBrowserExecutor().goToThePageByUrl(url);
    }

    protected void clickButtonByLocator(By locator, int timeout) {

        WebElement btn = getBrowserExecutor().waitForElementCondition(ExpectedConditions.elementToBeClickable(locator), timeout);

        btn.click();
    }

    //================================================================================
    // Check elements conditions
    //================================================================================

    protected boolean waitForWemElementIsClickableByLocator(By locator, int timeout) {

        try {
            getBrowserExecutor().waitForElementCondition(ExpectedConditions.elementToBeClickable(locator), timeout);
        } catch (Exception e) {
            return false;
        }

        return true;

    }

    protected boolean isElementDisplayedByLocator(By locator, Duration duration) {

        return getBrowserExecutor().isElementDisplayed(locator, duration);
    }

}