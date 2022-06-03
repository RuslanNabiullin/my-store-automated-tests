package my.store.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
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

    @After(order = 1)
    public void terminateChromeExecutor() {

        System.out.println("Terminate browser executor.");
        chromeExecutor.terminateDriver();

    }

}
