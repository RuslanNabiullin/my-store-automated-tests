package my.store.qa.pages.MyStorePages;

import my.store.qa.locators.MyStoreLocators.SignInLocators;
import my.store.qa.pages.BasePage;

import java.time.Duration;

public class SignInPage extends BasePage {

    private final SignInLocators locators;

    public SignInPage() {

        locators = new SignInLocators();
    }

    public boolean waitForBtnSubmitCreateDisplayed() {

        return waitForWemElementIsClickableByLocator(locators.getBtnSubmitCreate(), 5);
    }

    public boolean isBtnSubmitCreateDisplayed() {

        return isElementDisplayedByLocator(locators.getBtnSubmitCreate(), Duration.ofSeconds(1));
    }

}
