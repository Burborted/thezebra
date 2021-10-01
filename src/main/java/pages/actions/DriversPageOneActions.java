package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.DriversPageOneLocators;
import utils.SeleniumDriver;

public class DriversPageOneActions {

    DriversPageOneLocators driversPageOneLocators = null;

    public DriversPageOneActions(){
        this.driversPageOneLocators = new DriversPageOneLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), driversPageOneLocators);
    }

    public void inputFirstName(String firstname){
        driversPageOneLocators.firstNameField.clear();
        driversPageOneLocators.firstNameField.sendKeys(firstname);
    }

    public void inputLastName(String lastname){
        driversPageOneLocators.lastNameField.clear();
        driversPageOneLocators.lastNameField.sendKeys(lastname);
    }

    public void inputDOB(String dob){
        driversPageOneLocators.birthdateField.clear();
        driversPageOneLocators.birthdateField.sendKeys(dob);
    }

    public void inputAdress(String adress){
        driversPageOneLocators.addressField.clear();
        driversPageOneLocators.addressField.sendKeys(adress);
    }

    public void inputUnit(String unit){
        driversPageOneLocators.unitField.clear();
        driversPageOneLocators.unitField.sendKeys(unit);
    }

    public void inputCity(String city){
        driversPageOneLocators.cityField.clear();
        driversPageOneLocators.cityField.sendKeys(city);
    }

    public void inputState(String state){
        driversPageOneLocators.stateInputDropdown.clear();
        driversPageOneLocators.stateInputDropdown.sendKeys(state);
    }

    public void inputZip(String zip){
        driversPageOneLocators.zipCodeField.clear();
        driversPageOneLocators.zipCodeField.sendKeys(zip);
    }

    public void saveAndContinue(){
        driversPageOneLocators.saveAndContinueBtn.click();
    }
}
