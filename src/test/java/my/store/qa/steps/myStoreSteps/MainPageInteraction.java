package my.store.qa.steps.myStoreSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import my.store.qa.executors.ChromeExecutor;
import my.store.qa.pages.MainPage;
import org.junit.Assert;

public class MainPageInteraction {

    private MainPage mainPage;

    @Given("^go to the My store$")
    public void goToThe() {

        mainPage = new MainPage();
        mainPage.openMyStore();

    }

    @Then("^my store logo is displayed$")
    public void myStoreLogoIsDisplayed() {

        Assert.assertTrue("'My store' logo is not displayed.", mainPage.isMyStoreLogoDisplayed());

    }

}
