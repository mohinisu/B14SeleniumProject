package org.example.page_elements;

import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationComplete_Elements {
    WebDriver driver;

    public RegistrationComplete_Elements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "result")
    public WebElement registrationMessage;

    @FindBy(css = ".button-1.register-continue-button")
    public WebElement continueButton;
}