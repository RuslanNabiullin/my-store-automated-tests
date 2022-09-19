package my.store.qa.steps.MyStoreSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import my.store.qa.pages.MyStorePages.SignInPage;
import my.store.qa.world.Environment;
import org.junit.Assert;

public class SignInPageInteraction {

    private SignInPage signInPage;

    @Given("^open My Store sign in page$")
    public void openMyStoreSignInPage() {

        signInPage = new SignInPage();
        signInPage.openSignInPageDirectly();
    }

    @And("^click create an account button$")
    public void clickCreateAnAccountButton() {

        signInPage.clickCreateAccountButton();
    }

    @And("^enter email address \"([^\"]*)\"$")
    public void enterEmailAddress(String email) {

        signInPage.enterEmail(email);
    }

    @And("^error says that email is invalid$")
    public void errorSaysEmailIsInvalid() {

        String expectedMessage = Environment.getMyStoreTexts().getSignInInvalidEmail();
        String actualMessage = signInPage.getErrorMessage();

        Assert.assertEquals("Expected error message does not match to the actual.", expectedMessage, actualMessage);
    }

    @And("^error says that email exists$")
    public void errorSaysEmailExists() {
        
        String expectedMessage = Environment.getMyStoreTexts().getSignInEmailExists();
        String actualMessage = signInPage.getErrorMessage();

        Assert.assertEquals("Expected error message does not match to the actual.", expectedMessage, actualMessage);
    }

    @Then("^create account error (is|is not) displayed$")
    public void createAccountErrorIsNotDisplayed(String option) {

        if (option.equalsIgnoreCase("is")) {
            Assert.assertTrue("Create account Error is not displayed.", signInPage.waitForCreateAccountErrorIsDisplayed());
        } else {
            Assert.assertFalse("Create account Error is displayed.", signInPage.waitForCreateAccountErrorIsNotDisplayed());
        }
    }

}
