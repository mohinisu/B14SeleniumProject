package org.example.page_actions;

import org.example.page_elements.RegistrationComplete_Elements;
import org.example.page_elements.Registration_Elements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class RegistrationComplete_Actions {
    WebDriver driver;
    RegistrationComplete_Elements registrationCompleteElements;

    public RegistrationComplete_Actions(CommonSteps commonSteps, RegistrationComplete_Elements registrationCompleteElements) {
        this.driver = commonSteps.getDriver();
        this.registrationCompleteElements = registrationCompleteElements;
    }

    public String getTextMessage() {
        return registrationCompleteElements.registrationMessage.getText();
    }

    public void clickOnContinueButton() {
        registrationCompleteElements.continueButton.click();
    }
}