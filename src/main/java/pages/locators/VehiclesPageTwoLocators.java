package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehiclesPageTwoLocators {
    // Do you own or lease this vehicle?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]")
    public WebElement ownPaidBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement ownPayingBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement leaseBtn;


    // What do you mostly use it for?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement personalCommutingBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement pleasureBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement farmBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement businessRideshareBtn;

    // How many miles do you drive?
    @FindBy(how = How.XPATH, using = "//input[@id='miles-0']")
    public WebElement estimateMilageField;

    // Save and continue
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/a[1]")
    public WebElement saveAndContinueBtn;
}
