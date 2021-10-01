package com.thezebra.StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterACtions {

    @After
    public static void TearDown(Scenario scenario){
        SeleniumDriver.tearDown();
    }
}
