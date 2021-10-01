package com.thezebra.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.actions.*;
import pages.locators.QuotesPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;


public class GetCarInsuranceQuoteStepsDefs {

    TheZebraHomePageActions theZebraHomePageActions = new TheZebraHomePageActions();
    ZipRequestPageActions zipRequestPageActions = new ZipRequestPageActions();
    StartPageOneActions startPageOneActions = new StartPageOneActions();
    VehiclesPageOneActions vehiclesPageOneActions = new VehiclesPageOneActions();
    VehiclesPageTwoActions vehiclesPageTwoActions = new VehiclesPageTwoActions();
    DriversPageOneActions driversPageOneActions = new DriversPageOneActions();
    DriversPageTwoActions driversPageTwoActions = new DriversPageTwoActions();
    CoveragePageActions coveragePageActions = new CoveragePageActions();
    QuotesPageActions quotesPageActions = new QuotesPageActions();
    QuotesPageLocators quotesPageLocators = new QuotesPageLocators();


    @Given("I am on the Home Page of The Zebra website")
    public void i_am_on_the_home_page_of_the_zebra_website(){
        SeleniumDriver.openPage("https://www.thezebra.com/");
    }
    @When("I click on Car Insurance button")
    public void i_click_on_car_insurance_button(){
        theZebraHomePageActions.clickOnCarInsuranceButton();
    }
    @And("I should see a ZIP code request page")
    public void i_should_see_a_zip_code_request_page() {
        zipRequestPageActions.selectZipCodeInputField("95826");
        zipRequestPageActions.zipSubmitBtnClick();
    }
    @And("I fill in the Start Page form")
    public void i_fill_in_the_Start_Page_form() {
        startPageOneActions.currentCarInsuranceBtnClck("yes");
        startPageOneActions.resideStatusBtnClck();
        startPageOneActions.reasonForShoppingBtnClck();
        startPageOneActions.saveAndContinueBtnClck();
    }

    @And("I fill in the Vehicle form")
    public void i_fill_in_the_Vehicle_form() throws InterruptedException {
        vehiclesPageOneActions.iterateThruInputDropdown("2019");
        vehiclesPageOneActions.sendVehicleMake("Toyota");
        vehiclesPageOneActions.sendVehicleModel("Prius");
        vehiclesPageOneActions.sendVehicleSubmodel("Le 4dr Hatchback");
        vehiclesPageOneActions.saveAndContinueBtn();
    }

    @And("I fill in the Vehicle Two form")
    public void i_fill_in_the_Vehicle_Two_form(){
        vehiclesPageTwoActions.ownPayedBtn();
        vehiclesPageTwoActions.personalCommutBtn();
        vehiclesPageTwoActions.milesDrivenInput("30");
        vehiclesPageTwoActions.saveAndContinue();
    }

    @When("I fill in th Drivers Page One form")
    public void i_fill_in_th_drivers_page_one_form(){
        driversPageOneActions.inputFirstName("Elon");
        driversPageOneActions.inputLastName("Musk");
        driversPageOneActions.inputDOB("06/28/1971");
        driversPageOneActions.inputAdress("1445 Southernmost Lane");
        driversPageOneActions.inputUnit("42");
        driversPageOneActions.inputState("TX");
        driversPageOneActions.inputCity("Brownsville");
        driversPageOneActions.inputZip("78521");
        driversPageOneActions.saveAndContinue();
    }

    @When("I fill the Drivers Page two form")
    public void i_fill_the_drivers_page_one_form() throws InterruptedException {
        driversPageTwoActions.fillAllFieldsAtOnce();
    }

    @And("I choose the basic insurance quote")
    public void i_choose_the_basic_insurance_quite(){
        coveragePageActions.clickTheBasicInsuranceQuote();
    }

    @Then("I wait for all quotes to be present")
    public void i_wait_for_all_quotes_to_be_present() throws InterruptedException {
        WebElement webElement = quotesPageActions.quotesArePresnt();
        Assert.assertTrue(SeleniumHelper.isElementPresent(webElement));
    }
}
