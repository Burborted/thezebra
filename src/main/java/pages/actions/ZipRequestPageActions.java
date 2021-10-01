package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ZipRequestPageLocators;
import utils.SeleniumDriver;

public class ZipRequestPageActions {

    ZipRequestPageLocators zipRequestPageLocators = null;

    public ZipRequestPageActions(){
        this.zipRequestPageLocators = new ZipRequestPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), zipRequestPageLocators);
    }

    public void selectZipCodeInputField(String zipCode){
        zipRequestPageLocators.zipCodeInputField.sendKeys(zipCode);
    }

    public void zipSubmitBtnClick(){
        zipRequestPageLocators.zipCodeSubmitBtn.click();
    }
}
