package pages.locators;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuotesPageLocators {

    @Getter
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
    public WebElement allQuotesDiv;



    @Getter
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
    public WebElement callUsNow;
}
