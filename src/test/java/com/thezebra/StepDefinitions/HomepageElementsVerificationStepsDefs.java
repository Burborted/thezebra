package com.thezebra.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import pages.actions.TheZebraHomePageActions;
import utils.SeleniumDriver;


public class HomepageElementsVerificationStepsDefs {

    TheZebraHomePageActions theZebraHomePageActions = new TheZebraHomePageActions();

    @When("I scrolldown the Home Page")
    public void i_scrolldown_the_home_page() throws InterruptedException {
        ((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
    }
    @And("All important elements are present")
    public void all_important_elements_are_present() {
        Assert.assertTrue(theZebraHomePageActions.carInsuranceButtonIsPresent());
        Assert.assertTrue(theZebraHomePageActions.homeInsuranceLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.carPlusHomeLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.smallBusinessLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.carPlusRentLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.petLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.theZebraLogoIsPresent());
        Assert.assertTrue(theZebraHomePageActions.rentLinkIsPresent());
        Assert.assertTrue(theZebraHomePageActions.commercialAutoLinkIsPresent());

        Assert.assertEquals(theZebraHomePageActions.compareProvidersSignIsPresent(), "Compare top insurance\n" +
                "providers and start saving");
    }
}
