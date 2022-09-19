package my.store.qa.pages.MyStorePages;

import my.store.qa.locators.MyStoreLocators.MyStoreMainPageLocators;
import my.store.qa.pages.BasePage;
import my.store.qa.world.Environment;

import java.time.Duration;

public class MyStoreMainPage extends BasePage {

    private final MyStoreMainPageLocators locators;

    public MyStoreMainPage() {

        locators = new MyStoreMainPageLocators();
    }

    public void openMyStore() {

        String url = Environment.getMyStoreConfiguration().getMyStorePath();
        open(url);

    }

    public SignInPage goToSignInPage() {

        clickButtonByLocator(locators.getBtnSignInLocator(), 1);
        return new SignInPage();
    }

    public boolean isMyStoreLogoDisplayed() {

        return isElementDisplayedByLocator(locators.getLogoLocator(), Duration.ofSeconds(1));
    }

}
