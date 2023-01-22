package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import org.example.page_actions.Home_Actions;
import org.openqa.selenium.WebDriver;

public class  HomeSteps {
    WebDriver driver;
    Home_Actions homeActions;

    public HomeSteps(CommonSteps commonSteps, Home_Actions homeActions) {
        this.driver = commonSteps.getDriver();
        this.homeActions = homeActions;
    }

    @Given("I open application url")
    public void i_open_application_url() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        homeActions.clickOnLoginLink();
    }

    @Given("I navigate to register page")
    public void i_navigate_to_register_page() {
        homeActions.clickOnRegisterLink();
    }
}