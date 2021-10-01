package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.DriversPageTwoLocators;
import utils.SeleniumDriver;

public class DriversPageTwoActions {

    DriversPageTwoLocators driversPageTwoLocators = null;

    public DriversPageTwoActions(){
        this.driversPageTwoLocators = new DriversPageTwoLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), driversPageTwoLocators);
    }

    public void fillAllFieldsAtOnce() throws InterruptedException {
        driversPageTwoLocators.maleBtn.click();
        Thread.sleep(1000);
        driversPageTwoLocators.singleBtn.click();
        Thread.sleep(1000);
        driversPageTwoLocators.bachelorBtn.click();
        Thread.sleep(1000);
        driversPageTwoLocators.moreThanThreeBtn.click();
        Thread.sleep(1000);
        WebElement webElement = driversPageTwoLocators.getCurrentProviderInputDropdown();
        webElement.sendKeys("GEICO");
        webElement.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        webElement.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driversPageTwoLocators.upToFiveHundredBtn.click();
        Thread.sleep(1000);
        driversPageTwoLocators.noBtn.click();
        Thread.sleep(1000);
        driversPageTwoLocators.emailInputField.sendKeys("another@guy.ru");
        Thread.sleep(1000);
        driversPageTwoLocators.noSaveBtn.click();
        Thread.sleep(1000);
        WebElement webElement2 = driversPageTwoLocators.getHowDidYouHearAboutUsInputDropdown();
        webElement2.sendKeys("Facebook ad");
        webElement2.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        driversPageTwoLocators.saveAndContinueBtn.click();
    }
}
