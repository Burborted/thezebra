package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StartPageOneLocators {
    //Do you currently have car insurance?
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]")
    public WebElement currentInsuranceYesBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement currentInsuranceNoBtn;

    //Do you own or rent your home?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement homeOwnBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement condoOwnBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement homeRentBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement otherBtn;

    //Why are you shopping for insurance today?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement payingTooMuchBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement buyingACarSoonBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement aLifeEventBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement lookingForOptionsBtn;

    //Save and continue
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/a[1]")
    public WebElement saveAndContinueBtn;
}
