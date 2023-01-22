package org.example.page_elements;

import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Elements {
    WebDriver driver;

    public Login_Elements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }

    //    WebElement email = driver.findElement(By.id("email"));

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = ".button-1.login-button")
    public WebElement loginButton;
}