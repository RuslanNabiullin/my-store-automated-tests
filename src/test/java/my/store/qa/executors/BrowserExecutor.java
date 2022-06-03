package my.store.qa.executors;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BrowserExecutor {

    private static WebDriver driver;

    private static String executorName;

    public BrowserExecutor() {

    }

    public static void setDriver(final WebDriver driver) {

        BrowserExecutor.driver = driver;
    }

    public static WebDriver getDriver() {

        return BrowserExecutor.driver;
    }

    public static void setExecutorName(final String executorName) {

        BrowserExecutor.executorName = executorName;
    }

    public static String getExecutorName() {

        return BrowserExecutor.executorName;
    }

    public void goToThePageByUrl(final String url) {

        System.out.println("Go to the page with url: " + url);
        BrowserExecutor.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BrowserExecutor.driver.navigate().to(url);

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

    public void terminateExecutor() {

        BrowserExecutor.driver.manage().deleteAllCookies();
        BrowserExecutor.driver.quit();

    }

}
