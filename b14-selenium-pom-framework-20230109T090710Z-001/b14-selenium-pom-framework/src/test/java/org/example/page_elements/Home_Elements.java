package org.example.page_elements;

import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Elements {

    WebDriver driver;

    public Home_Elements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log in")
    public WebElement loginLink;

/* public WebElement loginLink =
        driver.findElement(By.linkText("")) */
}