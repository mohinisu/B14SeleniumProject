package org.example.page_actions;

import org.example.page_elements.Login_Elements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class Login_Actions {

    WebDriver driver;
    Login_Elements loginElements;

    public Login_Actions(CommonSteps commonSteps,
                         Login_Elements loginElements) {
        this.driver = commonSteps.getDriver();
        this.loginElements = loginElements;
    }

    public void enterEmail(String email) {
        loginElements.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginElements.password.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginElements.loginButton.click();
    }

}