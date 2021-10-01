package pages.locators;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehiclesPageOneLocators {
    // Let’s add your vehicle
    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-vehicle-year-0']")
    public WebElement vehicleYearInputDropdown;

    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-vehicle-make-0']")
    public WebElement vehicleMakeInputDropdown;

    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-vehicle-model-0']")
    public WebElement vehicleModelInputDropdown;

    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-vehicle-submodel-0']")
    public WebElement vehicleSubmodelInputDropdown;

    // Need to add another vehicle?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement addAnotherVehicleBtn;

    // Save and continue
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/a[1]")
    public WebElement saveAndContinueBtn;
}
