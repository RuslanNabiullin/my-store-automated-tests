package my.store.qa.locators.MyStoreLocators;

import org.openqa.selenium.By;

public class MyStoreMainPageLocators {

    private static By LOGO_MY_STORE;

    public MyStoreMainPageLocators() {

        LOGO_MY_STORE = By.cssSelector("[id=\"header_logo\"]");
    }

    public By getLogoLocator() {

        return LOGO_MY_STORE;
    }

}
