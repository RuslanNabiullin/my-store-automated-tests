package my.store.qa.steps.myStoreSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my.store.qa.pages.MyStoreMainPage;
import org.junit.Assert;

public class MainPageInteraction {

    private MyStoreMainPage myStoreMainPage;

    @Given("^go to the My store$")
    public void goToThe() {

        myStoreMainPage = new MyStoreMainPage();
        myStoreMainPage.openMyStore();

    }

    @Then("^my store logo is displayed$")
    public void myStoreLogoIsDisplayed() {

        Assert.assertTrue("'My store' logo is not displayed.", myStoreMainPage.isMyStoreLogoDisplayed());

    }

}
