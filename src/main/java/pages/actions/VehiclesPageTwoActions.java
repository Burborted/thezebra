package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.VehiclesPageTwoLocators;
import utils.SeleniumDriver;

public class VehiclesPageTwoActions {

    VehiclesPageTwoLocators vehiclesPageTwoLocators = null;

    public VehiclesPageTwoActions(){
        this.vehiclesPageTwoLocators = new VehiclesPageTwoLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), vehiclesPageTwoLocators);
    }

    public void ownPayedBtn(){
        vehiclesPageTwoLocators.ownPaidBtn.click();
    }

    public void personalCommutBtn(){
        vehiclesPageTwoLocators.personalCommutingBtn.click();
    }

    public void milesDrivenInput(String miles){
        vehiclesPageTwoLocators.estimateMilageField.sendKeys(miles);
    }

    public void saveAndContinue(){
        vehiclesPageTwoLocators.saveAndContinueBtn.click();
    }
}
