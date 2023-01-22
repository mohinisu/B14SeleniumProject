package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page_actions.Login_Actions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    Login_Actions loginActions;
    WebDriver driver;

    public LoginSteps(Login_Actions loginActions,
                      CommonSteps commonSteps) {
        this.loginActions = loginActions;
        this.driver = commonSteps.getDriver();
    }

    @When("I enter {string} and {string}")
    public void i_enter_email_and_password(String email, String password) {
        loginActions.enterEmail(email);
        loginActions.enterPassword(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        loginActions.clickOnLoginButton();
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Successful");
    }
}