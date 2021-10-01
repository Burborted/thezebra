package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TheZebraHomePageLocators {

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[3]/div/div/div[1]/a")
    public WebElement carInsuranceLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]")
    public WebElement homeInsuranceLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]")
    public WebElement carPlusHomeLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[4]/a[1]/div[1]")
    public WebElement carPlusRentLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[5]/a[1]/div[1]")
    public WebElement rentLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[6]/a[1]/div[1]")
    public WebElement petLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[9]/a[1]/div[1]")
    public WebElement smallBusinessLink;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[8]/a[1]/div[1]")
    public WebElement commercialAutoLink;

    @FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/a[1]/*[1]")
    public WebElement theZebraLogo;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/h1[1]")
    public WebElement compareProvidersSign;

}
