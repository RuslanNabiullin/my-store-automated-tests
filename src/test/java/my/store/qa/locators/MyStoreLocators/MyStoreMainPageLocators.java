package my.store.qa.locators.MyStoreLocators;

import org.openqa.selenium.By;

public class MyStoreMainPageLocators {

    private static By LOGO_MY_STORE;

    private static By BTN_SIGN_IN;

    public MyStoreMainPageLocators() {

        LOGO_MY_STORE = By.cssSelector("[id=\"header_logo\"]");

        BTN_SIGN_IN = By.cssSelector(".login");
    }

    public By getLogoLocator() {

        return LOGO_MY_STORE;
    }

    public By getBtnSignInLocator() {

        return BTN_SIGN_IN;
    }

}
