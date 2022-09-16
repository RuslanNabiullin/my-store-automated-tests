package my.store.qa.pages;

import my.store.qa.world.Environment;
import org.openqa.selenium.By;

import java.time.Duration;

public class MyStoreMainPage extends BasePage {

    private static final By LOGO_MY_STORE = By.cssSelector("[id=\"header_logo\"]");

    public void openMyStore() {

        String url = Environment.getMyStoreConfiguration().getMyStorePath();

        getBrowserExecutor().goToThePageByUrl(url);

    }

    public boolean isMyStoreLogoDisplayed() {

        return getBrowserExecutor().isElementDisplayed(LOGO_MY_STORE, Duration.ofSeconds(1));
    }

}
