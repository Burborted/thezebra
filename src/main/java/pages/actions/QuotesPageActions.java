package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.QuotesPageLocators;
import utils.SeleniumDriver;

public class QuotesPageActions {

    QuotesPageLocators quotesPageLocators = null;

    public QuotesPageActions(){
        this.quotesPageLocators = new QuotesPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), quotesPageLocators);
    }

    public WebElement quotesArePresnt(){
        WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")));
        WebElement webElement = quotesPageLocators.callUsNow;
        return webElement;
    }
}
