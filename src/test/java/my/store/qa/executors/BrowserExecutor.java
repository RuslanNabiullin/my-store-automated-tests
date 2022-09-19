package my.store.qa.executors;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public abstract class BrowserExecutor {

    private static WebDriver driver;

    private static String executorName;

    public BrowserExecutor() {

    }

    //================================================================================
    // Get/set
    //================================================================================

    public void setDriver(final WebDriver driver) {

        BrowserExecutor.driver = driver;
    }

    public WebDriver getDriver() {

        return BrowserExecutor.driver;
    }

    public void setExecutorName(final String executorName) {

        BrowserExecutor.executorName = executorName;
    }

    public String getExecutorName() {

        return BrowserExecutor.executorName;
    }

    //================================================================================
    // Page interaction
    //================================================================================

    public void goToThePageByUrl(final String url) {

        System.out.println("Go to the page with url: " + url);
        //TODO remove hardcoded timeout
        BrowserExecutor.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BrowserExecutor.driver.navigate().to(url);

    }

    public <V> V waitForElementCondition(ExpectedCondition<V> condition, int timeout) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        Objects.requireNonNull(condition);
        return webDriverWait.until(condition);
    }

    public WebElement getWebElementByLocator(By locator) {

        return driver.findElement(locator);
    }

    public boolean isElementDisplayed(final By element, final Duration duration) {

        BrowserExecutor.driver.manage().timeouts().implicitlyWait(duration);

        try {
            BrowserExecutor.driver.findElement(element);
        } catch (NoSuchElementException e) {
            return false;
        }

        return true;

    }

    //================================================================================
    // Driver interaction
    //================================================================================

    public void terminateExecutor() {

        BrowserExecutor.driver.manage().deleteAllCookies();
        BrowserExecutor.driver.quit();

    }

}
