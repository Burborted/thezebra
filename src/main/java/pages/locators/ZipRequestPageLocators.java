package pages.locators;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZipRequestPageLocators {

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement zipCodeInputField;


    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div/div/form/div[2]/div[1]/div[2]/button")
    public WebElement zipCodeSubmitBtn;
}
