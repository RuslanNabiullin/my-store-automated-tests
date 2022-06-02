package my.store.qa.pages;

import my.store.qa.executors.ChromeExecutor;
import org.openqa.selenium.By;

import java.time.Duration;

public class MainPage {

    private static final By LOGO_MY_STORE = By.cssSelector("[id=\"header_logo\"]");

    private static final String MY_STORE_URL = "https://automationpractice.com/index.php";

    public void openMyStore(ChromeExecutor chromeExecutor) {

        chromeExecutor.goToThePageByUrl(MY_STORE_URL);

    }

    public boolean isMyStoreLogoDisplayed(ChromeExecutor chromeExecutor) {

        return chromeExecutor.isElementDisplayed(LOGO_MY_STORE, Duration.ofSeconds(1));
    }

}
