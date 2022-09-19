package my.store.qa.pages.MyStorePages;

import my.store.qa.locators.MyStoreLocators.SignInLocators;
import my.store.qa.pages.BasePage;
import my.store.qa.world.Environment;

public class SignInPage extends BasePage {

    private final SignInLocators locators;

    public SignInPage() {

        locators = new SignInLocators();
    }

    //================================================================================
    // Interact with page
    //================================================================================

    public void openSignInPageDirectly() {

        String url = Environment.getMyStoreUrls().getSignInPagePath();
        open(url);
    }

    public void clickCreateAccountButton() {

        clickButtonByLocator(locators.getBtnSubmitCreate());
    }

    public void enterEmail(String content) {

        enterTextIntoElementByLocator(locators.getEmailInput(), content);
    }

    public String getErrorMessage() {

        return getElementTextByLocator(locators.getLblCreateAccountError());
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

    public boolean waitForCreateAccountErrorIsNotDisplayed() {

        return waitForWebElementIsClickableByLocator(locators.getLblCreateAccountError(), 1);
    }
}
