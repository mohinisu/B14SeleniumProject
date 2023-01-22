package org.example.page_actions;

import org.example.page_elements.Home_Elements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Actions {
    WebDriver driver;
    Home_Elements home_elements;

    public Home_Actions(CommonSteps commonSteps, Home_Elements home_elements) {
        this.driver = commonSteps.getDriver();
        this.home_elements = home_elements;
    }

    public void clickOnLoginLink() {
        home_elements.loginLink.click();
    }

    public void clickOnRegisterLink() {
        home_elements.registerLink.click();
    }
}