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

    //================================================================================
    // Interact with page
    //================================================================================

    public void openSignInPageDirectly() {

        String url = Environment.getMyStoreConfiguration().getSignInPagePath();
        open(url);
    }

    public void clickCreateAccountButton() {

        clickButtonByLocator(locators.getBtnSubmitCreate());
    }

    public void enterEmail(String content) {

        enterTextIntoElementByLocator(locators.getEmailInput(), content);
    }

    //================================================================================
    // Wait elements
    //================================================================================

    public boolean waitForBtnSubmitCreateIsDisplayed() {

        return waitForWebElementIsClickableByLocator(locators.getBtnSubmitCreate(), 5);
    }

    public boolean waitForCreateAccountErrorIsDisplayed() {

        return waitForWebElementIsClickableByLocator(locators.getLblCreateAccountError(), 10);
    }

    public boolean isBtnSubmitCreateDisplayed() {

        return isElementDisplayedByLocator(locators.getBtnSubmitCreate(), Duration.ofSeconds(1));
    }

}
