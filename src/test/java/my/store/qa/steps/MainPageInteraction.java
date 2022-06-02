package my.store.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my.store.qa.executors.ChromeExecutor;
import my.store.qa.pages.MainPage;
import org.junit.Assert;

public class MainPageInteraction {

    private ChromeExecutor chromeExecutor;

    private MainPage mainPage;

    @Given("^go to the \"([^\"]*)\"$")
    public void goToThe(String webName) {

        chromeExecutor = new ChromeExecutor();
        mainPage = new MainPage();

        mainPage.openMyStore(chromeExecutor);

    }

    @Then("^my store logo is displayed$")
    public void myStoreLogoIsDisplayed() {

        Assert.assertTrue("'My store' logo is not displayed.", mainPage.isMyStoreLogoDisplayed(chromeExecutor));

    }

}
