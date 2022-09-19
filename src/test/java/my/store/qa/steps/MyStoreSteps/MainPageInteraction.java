package my.store.qa.steps.MyStoreSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my.store.qa.pages.MyStorePages.MyStoreMainPage;
import my.store.qa.pages.MyStorePages.SignInPage;
import org.junit.Assert;

public class MainPageInteraction {

    private MyStoreMainPage myStoreMainPage;

    private SignInPage signInPage;

    @Given("^go to the My store$")
    public void goToThe() {

        myStoreMainPage = new MyStoreMainPage();
        myStoreMainPage.openMyStore();

    }

    @And("^click sign in button")
    public void clickSignInButton() {

        signInPage = myStoreMainPage.goToSignInPage();
    }

    @Then("^my store logo is displayed$")
    public void myStoreLogoIsDisplayed() {

        Assert.assertTrue("'My store' logo is not displayed.", myStoreMainPage.isMyStoreLogoDisplayed());

    }

    @Then("^submit/create account button is displayed$")
    public void submitCreateAccountButtonIsDisplayed() {

        Assert.assertTrue("Submit/create account button is displayed", signInPage.waitForBtnSubmitCreateDisplayed());
    }

}
