package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CoveragePageLocators {

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement minimumQuoteShowBtn;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement basicQuoteShowBtn;

    @FindBy(how = How.XPATH, using = "//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
    public WebElement betterQuoteShowBtn;
}
