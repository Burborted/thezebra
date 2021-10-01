package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriversPageOneLocators {

    // Tell us a little about yourself
    @FindBy(how = How.XPATH, using = "//input[@id='first_name-0']")
    public WebElement firstNameField;

    @FindBy(how = How.XPATH, using = "//input[@id='last_name-0']")
    public WebElement lastNameField;

    @FindBy(how = How.XPATH, using = "//input[@id='date_of_birth-0']")
    public WebElement birthdateField;

    @FindBy(how = How.XPATH, using = "//input[@id='garaging_address']")
    public WebElement addressField;

    @FindBy(how = How.XPATH, using = "//input[@id='unit']")
    public WebElement unitField;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    public WebElement cityField;

    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-state']")
    public WebElement stateInputDropdown;

    @FindBy(how = How.XPATH, using = "//input[@id='zipcode']")
    public WebElement zipCodeField;

    // Save and continue
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/a[1]")
    public WebElement saveAndContinueBtn;
}
