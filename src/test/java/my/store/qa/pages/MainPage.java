package my.store.qa.pages;

import my.store.qa.executors.ChromeExecutor;
import org.openqa.selenium.By;

import java.time.Duration;

public class MainPage extends BasePage {

    private static final By LOGO_MY_STORE = By.cssSelector("[id=\"header_logo\"]");

    private static final String MY_STORE_URL = "https://automationpractice.com/index.php";

    public void openMyStore() {

        getBrowserExecutor().goToThePageByUrl(MY_STORE_URL);

    }

    public boolean isMyStoreLogoDisplayed() {

        return getBrowserExecutor().isElementDisplayed(LOGO_MY_STORE, Duration.ofSeconds(1));
    }

}
