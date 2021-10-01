package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.VehiclesPageOneLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class VehiclesPageOneActions {

    VehiclesPageOneLocators vehiclesPageOneLocators = null;

    public VehiclesPageOneActions(){
        this.vehiclesPageOneLocators = new VehiclesPageOneLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), vehiclesPageOneLocators);
    }

    public void iterateThruInputDropdown(String year) throws InterruptedException {

        int yearMake = (int) Double.parseDouble(year);
        int numberOfPushes = 1;

        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        WebElement webElement = SeleniumDriver.getDriver().findElement(By.id("dropdown-input-vehicle-year-0"));

        String script = "return document.querySelector(\"#dropdown-vehicle-year-0 > input[type=hidden]\").value";
        String text = (String) js.executeScript(script);

        /*Here we can add an "if" statement that check the first digits of yearMake.
        F.ex. if it is "1990", then we send "190" to dynamicInputDropdownIterator.*/
        while (!String.valueOf(yearMake).equals(text)){
            SeleniumHelper.dynamicInputDropdownIterator("20", numberOfPushes, webElement);
            text = (String) js.executeScript(script);
            numberOfPushes++;
        }
    }

    public void sendVehicleMake(String make) throws InterruptedException {
        WebElement webElement = vehiclesPageOneLocators.getVehicleMakeInputDropdown();
        webElement.sendKeys(make);
        webElement.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        webElement.sendKeys(Keys.ENTER);
    }

    public void sendVehicleModel(String model) throws InterruptedException {
        WebElement webElement = vehiclesPageOneLocators.getVehicleModelInputDropdown();
        webElement.sendKeys(model);
        webElement.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        webElement.sendKeys(Keys.ENTER);
    }

    public void sendVehicleSubmodel(String submodel) throws InterruptedException {
        WebElement webElement = vehiclesPageOneLocators.getVehicleSubmodelInputDropdown();
        webElement.sendKeys(submodel);
        webElement.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        webElement.sendKeys(Keys.ENTER);
    }

    public void saveAndContinueBtn(){
        vehiclesPageOneLocators.saveAndContinueBtn.click();
    }
}
