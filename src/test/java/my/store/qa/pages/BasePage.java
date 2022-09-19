package my.store.qa.pages;

import my.store.qa.executors.BrowserExecutor;
import my.store.qa.executors.MultiBrowserManager;
import org.openqa.selenium.By;

import java.time.Duration;

public class BasePage {

    public BrowserExecutor getBrowserExecutor() {

        return MultiBrowserManager.getBrowserExecutor();
    }

    public void open(String url) {

        getBrowserExecutor().goToThePageByUrl(url);
    }

    public boolean isElementDisplayedByLocator(By locator,Duration duration) {

        return getBrowserExecutor().isElementDisplayed(locator, duration);
    }

}