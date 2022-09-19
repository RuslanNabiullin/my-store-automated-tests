package my.store.qa.pages.MyStorePages;

import my.store.qa.locators.MyStoreLocators.SignInLocators;
import my.store.qa.pages.BasePage;
import my.store.qa.world.Environment;

import java.time.Duration;

public class SignInPage extends BasePage {

    private final SignInLocators locators;

    public SignInPage() {

        locators = new SignInLocators();
    }

    public void openSignInPageDirectly() {

        String url = Environment.getMyStoreConfiguration().getSignInPagePath();
        open(url);
    }

    public void clickCreateAccountButton() {

        clickButtonByLocator(locators.getBtnSubmitCreate(), 1);
    }

    public boolean waitForBtnSubmitCreateIsDisplayed() {

        return waitForWemElementIsClickableByLocator(locators.getBtnSubmitCreate(), 5);
    }

    public boolean waitForCreateAccountErrorIsDisplayed() {

        return waitForWemElementIsClickableByLocator(locators.getLblCreateAccountError(), 10);
    }

    public boolean isBtnSubmitCreateDisplayed() {

        return isElementDisplayedByLocator(locators.getBtnSubmitCreate(), Duration.ofSeconds(1));
    }

}
