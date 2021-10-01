package pages.locators;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriversPageTwoLocators {

    // What’s your gender?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/div[1]")
    public WebElement maleBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement femaleBtn;

    // What’s your marital status?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement singleBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement marriedBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement divorcedBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement widowedBtn;

    // What’s your credit score?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement excellentBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement goodBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement averageBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement poorBtn;

    // What’s the highest level of education you completed?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement doctoralBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement mastersBtn;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[3]/div[1]")
    public WebElement bachelorBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement hsBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[5]/div[1]/div[1]")
    public WebElement nodiplomaBtn;

    // How long have you been continuously insured?
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[1]/div[1]")
    public WebElement moreThanThreeBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement oneToThreeBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement sixToTwelveMonthsBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement lessThanSixMonthBtn;

    // Who is your current provider?
    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-current_carrier-0']")
    public WebElement currentProviderInputDropdown;

    // Which bodily injury limits are closest to your current coverage?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement zeroBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement upToTwentyBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement upToHundredBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement upToThreeHundredBtn;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/label[5]/div[1]/div[2]")
    public WebElement upToFiveHundredBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/label[6]/div[1]/div[1]")
    public WebElement iDontKnowBtn;

    // Any accidents or tickets in the last 3 years?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[8]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]")
    public WebElement yesBtn;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]")
    public WebElement noBtn;

    // Where would you like to receive a copy of your quotes?
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[8]/div[1]/div[2]/div[1]/input[1]")
    public WebElement emailInputField;

    // Want to save your info for next time?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[10]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]")
    public WebElement yesSaveBtn;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]")
    public WebElement noSaveBtn;

    // Do any of these discounts apply?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[11]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement employeeFullTimeCheckbox;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[11]/div[1]/div[2]/label[2]/div[1]/div[1]")
    public WebElement activeMilitaryOrVeteranCheckbox;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[11]/div[1]/div[2]/label[3]/div[1]/div[1]")
    public WebElement payInFullAtStartOfPolicyCheckbox;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[11]/div[1]/div[2]/label[4]/div[1]/div[1]")
    public WebElement setUpAutoPayCheckbox;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[11]/div[1]/div[2]/label[5]/div[1]/div[1]")
    public WebElement goPaperlessCheckbox;

    // How did you hear about us?
    @Getter
    @FindBy(how = How.XPATH, using = "//input[@id='dropdown-input-referral_source']")
    public WebElement howDidYouHearAboutUsInputDropdown;

    // Need to add another driver?
    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[13]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/div[1]")
    public WebElement yesDriverBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[13]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]")
    public WebElement noDriverBtn;

    // Save and continue
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/div[13]/div[1]/div[2]/a[1]")
    public WebElement saveAndContinueBtn;
}
