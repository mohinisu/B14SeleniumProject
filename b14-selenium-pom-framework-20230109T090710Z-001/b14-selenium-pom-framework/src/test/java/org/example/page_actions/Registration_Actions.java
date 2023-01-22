package org.example.page_actions;

import org.example.page_elements.Registration_Elements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class   Registration_Actions {
    WebDriver driver;
    Registration_Elements registrationElements;

    public Registration_Actions(CommonSteps commonSteps, Registration_Elements registrationElements) {
        this.driver = commonSteps.getDriver();
        this.registrationElements = registrationElements;
    }

    public void selectGenderMale() {
        registrationElements.genderMale.click();
    }

    public void selectGenderFemale() {
        registrationElements.genderFemale.click();
    }

    public void enterFirstName(String firstName) {
        registrationElements.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        registrationElements.lastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        registrationElements.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        registrationElements.password.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        registrationElements.confirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton() {
        registrationElements.registerButton.click();
    }

}