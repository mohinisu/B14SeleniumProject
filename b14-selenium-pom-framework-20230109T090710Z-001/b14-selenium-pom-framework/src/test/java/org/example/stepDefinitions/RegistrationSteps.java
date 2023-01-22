package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.example.page_actions.RegistrationComplete_Actions;
import org.example.page_actions.Registration_Actions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {

    WebDriver driver;
    Registration_Actions registrationActions;
    RegistrationComplete_Actions registrationCompleteActions;

    public RegistrationSteps(CommonSteps commonSteps, Registration_Actions registrationActions, RegistrationComplete_Actions registrationCompleteActions) {
        this.driver = commonSteps.getDriver();
        this.registrationActions = registrationActions;
        this.registrationCompleteActions = registrationCompleteActions;
    }

    @When("I fill registration form")
    public void i_fill_registration_form(DataTable dataTable) {
        registrationActions.selectGenderFemale();
        registrationActions.enterFirstName(dataTable.cell(1, 0));
        registrationActions.enterLastName(dataTable.cell(1, 1));
        registrationActions.enterEmail(dataTable.cell(1, 2));
        registrationActions.enterPassword(dataTable.cell(1, 3));
        registrationActions.enterConfirmPassword(dataTable.cell(1, 4));


//           | column 0  | column 1 | column 2                | column 3 | column 4        |
//  Row 0 => | FirstName | LastName | Email                   | Password | ConfirmPassword |
//  Row 1 => | Test      | Test     | Test1sdjnsw001@test.com | test1234 | test1234        |
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        registrationActions.clickOnRegisterButton();
    }

    @Then("The Message {string} should be displayed")
    public void registration_successful_message_should_be_displayed(String expectedMessage) {
        String actualTextMessage = registrationCompleteActions.getTextMessage();
        Assert.assertEquals(expectedMessage, actualTextMessage);
    }
}