package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.CoveragePageLocators;
import utils.SeleniumDriver;

public class CoveragePageActions {

    CoveragePageLocators coveragePageLocators = null;

    public CoveragePageActions(){
        this.coveragePageLocators = new CoveragePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), coveragePageLocators);
    }

    public void clickTheBasicInsuranceQuote(){
        coveragePageLocators.basicQuoteShowBtn.click();
    }
}
