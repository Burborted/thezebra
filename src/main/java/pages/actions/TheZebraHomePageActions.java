package pages.actions;

import io.cucumber.java.bs.A;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.TheZebraHomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class TheZebraHomePageActions {
    TheZebraHomePageLocators theZebraHomePageLocators = null;

    public TheZebraHomePageActions(){
        this.theZebraHomePageLocators = new TheZebraHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), theZebraHomePageLocators);
    }

    public void clickOnCarInsuranceButton(){
        theZebraHomePageLocators.carInsuranceLink.click();
    }

    public boolean carInsuranceButtonIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.carInsuranceLink);
    }

    public boolean homeInsuranceLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.homeInsuranceLink);
    }

    public boolean carPlusHomeLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.carPlusHomeLink);
    }

    public boolean carPlusRentLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.carPlusRentLink);
    }

    public boolean rentLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.rentLink);
    }

    public boolean petLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.petLink);
    }

    public boolean smallBusinessLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.smallBusinessLink);
    }

    public boolean commercialAutoLinkIsPresent(){
        return SeleniumHelper.isElementPresent(theZebraHomePageLocators.commercialAutoLink);
    }

    public boolean theZebraLogoIsPresent(){
        return theZebraHomePageLocators.theZebraLogo.isDisplayed();
    }

    public String compareProvidersSignIsPresent(){
        return theZebraHomePageLocators.compareProvidersSign.getText();
    }

}
