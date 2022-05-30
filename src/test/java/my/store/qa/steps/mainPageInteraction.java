package my.store.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class mainPageInteraction {

    @Given("^go to the \"([^\"]*)\"$")
    public void goToThe(String webName) {

        System.out.println("Hello world");

    }

    @Then("^my store logo is displayed$")
    public void myStoreLogoIsDisplayed() {

        System.out.println("My store logo is displayed");

    }

}
