package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.StartPageOneLocators;
import utils.SeleniumDriver;

public class StartPageOneActions {
    StartPageOneLocators startPageOneLocators = null;

    public StartPageOneActions(){
        this.startPageOneLocators = new StartPageOneLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), startPageOneLocators);
    }

    public void currentCarInsuranceBtnClck(String option){
        if (option.equalsIgnoreCase("yes")){
            startPageOneLocators.currentInsuranceYesBtn.click();
        } else {
            startPageOneLocators.currentInsuranceNoBtn.click();
        }

    }

    public void resideStatusBtnClck(){
        startPageOneLocators.homeRentBtn.click();
    }

    public void reasonForShoppingBtnClck(){
        startPageOneLocators.buyingACarSoonBtn.click();
    }

    public void saveAndContinueBtnClck(){
        startPageOneLocators.saveAndContinueBtn.click();
    }
}
