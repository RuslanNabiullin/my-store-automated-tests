package my.store.qa.locators.MyStoreLocators;

import org.openqa.selenium.By;

public class SignInLocators {

    private final By BTN_SUBMIT_CREATE;

    public SignInLocators() {

        BTN_SUBMIT_CREATE = By.cssSelector("[id=\"SubmitCreate\"]");
    }

    public By getBtnSubmitCreate() {

        return BTN_SUBMIT_CREATE;
    }

}
