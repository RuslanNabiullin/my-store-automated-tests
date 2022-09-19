package my.store.qa.locators.MyStoreLocators;

import org.openqa.selenium.By;

public class SignInLocators {

    private final By LBL_CREATE_ACCOUNT_ERROR;

    private final By BTN_SUBMIT_CREATE;

    public SignInLocators() {

        BTN_SUBMIT_CREATE = By.cssSelector("[id=\"SubmitCreate\"]");

        LBL_CREATE_ACCOUNT_ERROR = By.cssSelector("[id=\"create_account_error\"]");
    }

    public By getBtnSubmitCreate() {

        return BTN_SUBMIT_CREATE;
    }

    public By getLblCreateAccountError() {

        return LBL_CREATE_ACCOUNT_ERROR;
    }

}
